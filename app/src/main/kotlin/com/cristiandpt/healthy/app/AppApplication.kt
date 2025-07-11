package com.cristiandpt.healthy.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(
        scanBasePackages =
                [
                        "com.cristiandpt.healthy.app", // Your main app module
                        "com.cristiandpt.api", // Your infrastructure:api module
                        "com.cristiandpt.core", // Your core module (assuming this package name)
                        "com.cristiandpt.data", // Your data module (assuming this package name)
                        "com.cristiandpt.database", // Your infrastructure:database module (assuming
                        // this package name)
                        "com.cristiandpt.healthy",
                ]
)
class AppApplication

fun main(args: Array<String>) {
    runApplication<AppApplication>(*args)
}
