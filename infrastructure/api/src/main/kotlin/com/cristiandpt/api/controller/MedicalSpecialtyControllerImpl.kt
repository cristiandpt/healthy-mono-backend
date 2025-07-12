package com.cristiandpt.healthy.api.controller

import com.cristiandpt.healthy.api.endpoint.MedicalSpecialtyEndpoint
import com.cristiandpt.healthy.core.model.SpecialtyModel
import com.cristiandpt.healthy.core.service.SpecialtyService
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class MedicalSpecialtyControllerImpl constructor(private val service: SpecialtyService) :
        MedicalSpecialtyEndpoint {

    override fun specialties(): List<SpecialtyModel> = service.getSpecialties()

    override fun specialtyById(@PathVariable id: String): String = id
}
