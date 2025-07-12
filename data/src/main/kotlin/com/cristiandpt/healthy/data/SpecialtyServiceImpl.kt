package com.cristiandpt.healthy.data

import com.cristiandpt.healthy.core.model.SpecialtyModel
import com.cristiandpt.healthy.core.service.SpecialtyService
import com.cristiandpt.healthy.database.repository.SpecialtyRepository
import org.springframework.core.convert.ConversionService

class SpecialtyServiceImpl
constructor(
        private val repository: SpecialtyRepository,
        private val conversionService: ConversionService
) : SpecialtyService {

    override fun getSpecialties(): List<SpecialtyModel> =
            repository.findAll().mapNotNull {
                conversionService.convert(it, SpecialtyModel::class.java)
            }
}
