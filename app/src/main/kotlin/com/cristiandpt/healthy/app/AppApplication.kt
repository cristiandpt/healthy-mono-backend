package com.cristiandpt.healthy.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication(
        scanBasePackages =
                [
                        "com.cristiandpt.healthy.app", // Your main app module
                        "com.cristiandpt.healthy.api", // Your infrastructure:api module
                        // "com.cristiandpt.core", // Your core module (assuming this package name)
                        "com.cristiandpt.healthy.data", // Your data module (assuming this package
                        // name)
                        //   "com.cristiandpt.database", // Your infrastructure:database module
                        // (assuming
                        // this package name)
                        "com.cristiandpt.healthy",
                        "com.cristiandpt.healthy.database",
                // "com.cristiandpt.infrastructure",
                // "com.cristiandpt.infrastructure.database",
                ]
)
@EntityScan(
        basePackages =
                [
                        "com.cristiandpt.healthy.database.entity", // Package where SpecialtyEntity
                        // is
                        "com.cristiandpt.healthy.database",
                // Add other entity packages if you have them in other modules
                ]
)
@EnableJpaRepositories( // <--- ADD THIS ANNOTATION!
        basePackages = ["com.cristiandpt.healthy.database.repository" // Specify the exact package
                // for your repositories
                ]
)
class AppApplication

fun main(args: Array<String>) {
    runApplication<AppApplication>(*args)
}
