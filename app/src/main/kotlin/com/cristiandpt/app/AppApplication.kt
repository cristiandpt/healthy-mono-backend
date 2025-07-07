package com.cristiandpt.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(
    scanBasePackages = [
            "com.cristiandpt.app",                 // Your main app module
            "com.cristiandpt.api",                 // Your infrastructure:api module
            "com.cristiandpt.core",                // Your core module (assuming this package name)
            "com.cristiandpt.data",                // Your data module (assuming this package name)
            "com.cristiandpt.database"             // Your infrastructure:database module (assuming this package name)
        ]
)
class AppApplication

fun main(args: Array<String>) {
	runApplication<AppApplication>(*args)
}
