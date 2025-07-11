package com.cristiandpt.api.endpoint

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("\${api.specialty.specialties}")
interface MedicalSpecialtyEndpoint {

    @GetMapping fun specialties(): Array<String>

    @GetMapping("\${api.specialty.specialty-by-id}")
    fun specialtyById(@PathVariable id: String): String
}
