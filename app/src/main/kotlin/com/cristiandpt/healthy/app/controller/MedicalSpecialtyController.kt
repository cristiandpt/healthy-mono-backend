package com.cristiandpt.healthy.app.controller

import com.cristiandpt.api.config.AuthEndpointsProperties
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/specialties")
class MedicalSpecialtyController
constructor(private val authEndpointsProperties: AuthEndpointsProperties) {

    @GetMapping fun specialties(): Array<String> = arrayOf()

    @GetMapping("/{id}") fun specialtyById(@PathVariable id: String): String = id
}
