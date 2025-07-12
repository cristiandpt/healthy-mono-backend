package com.cristiandpt.healthy.data

import com.cristiandpt.database.repository.SpecialtyRepository
import com.cristiandpt.healthy.core.model.SpecialtyModel
import com.cristiandpt.healthy.core.service.SpecialtyService
import org.springframework.stereotype.Service

@Service
class SpecialtyServiceImpl constructor(val repository: SpecialtyRepository) : SpecialtyService {

    override fun getSpecialties(): Array<SpecialtyModel> = arrayOf()
}
