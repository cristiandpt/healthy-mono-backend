package com.cristiandpt.healthy.api.endpoint

import com.cristiandpt.healthy.core.model.SpecialtyModel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("\${api.specialty.specialties}")
interface MedicalSpecialtyEndpoint {

    @GetMapping fun specialties(): List<SpecialtyModel>

    @GetMapping("\${api.specialty.specialty-by-id}")
    fun specialtyById(@PathVariable id: String): String
}
