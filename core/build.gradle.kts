


plugins {
    // Apply the Kotlin JVM plugin to enable Kotlin compilation
    kotlin("jvm") version "1.9.25" // Use your preferred Kotlin version
    `java-library`  // Jar library
}

group = "com.cristiandpt.healthy"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {

    // Kotlin standard library
    implementation(kotlin("stdlib-jdk8"))

    // Logging (e.g., SLF4J and Logback - choose your preferred logging facade/implementation)
    implementation("org.slf4j:slf4j-api:2.0.13")
    // Test dependencies
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.2")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17" // Must match java.targetCompatibility
    }
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
