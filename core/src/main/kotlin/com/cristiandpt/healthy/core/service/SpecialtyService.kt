package com.cristiandpt.healthy.core.service

import com.cristiandpt.healthy.core.model.SpecialtyModel

interface SpecialtyService {
    fun getSpecialties(): Array<SpecialtyModel>
}
