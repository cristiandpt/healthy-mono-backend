package com.cristiandpt.api.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/specialties")
class SpecialtyController {

    @GetMapping fun specialties(): Array<String> = arrayOf()

    @GetMapping("/{id}") fun specialtyById(@PathVariable id: String): String = id
}
