#!/bin/bash
#

ROOT_DIR="./"
BASE_PACKAGE="com/cristiandpt/healthy"

APP_MODULE="app"
CORE_MODULE="core"
DATA_MODULE="data"
INFRASTRUCTURE_MODULE="infrastructure"
CONFIG_MODULE="config"

declare -A MODULES=(
    ["$APP_MODULE"]="app"
    ["$CORE_MODULE"]="lib"
    ["$DATA_MODULE"]="lib"
    ["$INFRASTRUCTURE_MODULE"]="app"
    ["$CONFIG_MODULE"]="app"
)

declare -a project_type

declare_project() {
    local name=$1
    local type=$2

    # Declare an associative array for the project
    declare -A project
    project[name]="$name"
    project[type]="$type"

    # Store the associative array in the indexed array
    project_type+=("$(declare -p project)")
}

create_project_structure() {
    for i in "${!project_type[@]}"; do
        eval "${project_type[i]}"  # Evaluate the associative array

        if [ "${project[type]}" == "lib" ]; then
            local MODULE_NAME=${project[name]}
            local SOURCE_PATH=$ROOT_DIR$MODULE_NAME
            path_to_create=(
                "/src/main/kotlin/$BASE_PACKAGE"
                "/src/main/resources"
                "/src/test/kotlin/$BASE_PACKAGE"
                "/src/test/resources")
            for path in "${path_to_create[@]}"; do
                 mkdir -p $SOURCE_PATH$path
            done
            echo "Module $SOURCE_PATH created sucessfully!"

            cat << EOF > "$ROOT_DIR$MODULE_NAME/build.gradle"
plugins {
        id "org.springframework.boot"
        id "io.spring.dependency-management"
        id "org.jetbrains.kotlin.jvm"
}

group = "$BASE_PACKAGE"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
    maven("https://repo.spring.io/milestone")
}

dependencies {
    implementation "org.springframework.boot:spring-boot-starter"
    implementation "com.fasterxml.jackson.module:jackson-module-kotlin"
    implementation "org.jetbrains.kotlin:kotlin-reflect"
    testImplementation "org.springframework.boot:spring-boot-starter-test"
}

tasks.withType<Test> {
    useJUnitPlatform()
}
EOF

        elif [ "${project[type]}" == "app" ]; then
            local MODULE_NAME=${project[name]}
            PROJECT_NAME="$MODULE_NAME-app"
            OUTPUT_FILE="${PROJECT_NAME}.zip"
            DEPENDENCIES="web,jpa,devtools"
            GROUP_ID="com.cristiandpt"
            ARTIFACT_ID="${PROJECT_NAME}"
            PACKAGE_NAME="com.cristiandpt.${PROJECT_NAME}"
            VERSION="0.0.1"
            DESCRIPTION="Spring Boot Application for measurement device generation"
            LANGUAGE="kotlin"
            JAVA_VERSION="17"
            TYPE="gradle-project"

            curl https://start.spring.io/starter.zip \
                -d dependencies="${DEPENDENCIES}" \
                -d name="${PROJECT_NAME}" \
                -d artifactId="${ARTIFACT_ID}" \
                -d groupId="${GROUP_ID}" \
                -d packageName="${PACKAGE_NAME}" \
                -d version="${VERSION}" \
                -d description="${DESCRIPTION}" \
                -d type="${TYPE}" \
                -d language="${LANGUAGE}" \
                -d javaVersion="${JAVA_VERSION}" \
                -o "${OUTPUT_FILE}"

                # Unzip the file into the module directory
                if [ -f "$OUTPUT_FILE" ]; then
                    echo "Unzipping $OUTPUT_FILE into $MODULE_NAME..."
                    unzip "$OUTPUT_FILE" -d "$ROOT_DIR$MODULE_NAME"
                    echo "Successfully unzipped $OUTPUT_FILE."

                    # Remove the .zip file
                    echo "Removing $OUTPUT_FILE..."
                    rm "$OUTPUT_FILE"
                    echo "$OUTPUT_FILE removed successfully."
                else
                    echo "Error: $OUTPUT_FILE not found."
                fi
        fi
    done
}

for module in "${!MODULES[@]}"; do
    declare_project "$module" "${MODULES[$module]}"
done

# Create project structure
create_project_structure
