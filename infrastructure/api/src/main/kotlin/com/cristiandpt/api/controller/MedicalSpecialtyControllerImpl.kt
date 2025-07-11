package com.cristiandpt.healthy.app.controller

import com.cristiandpt.api.endpoint.MedicalSpecialtyEndpoint
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class MedicalSpecialtyControllerImpl : MedicalSpecialtyEndpoint {

    override fun specialties(): Array<String> = arrayOf("uno", "dos", "three")

    override fun specialtyById(@PathVariable id: String): String = id
}
