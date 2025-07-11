package com.cristiandpt.infrastructure.database.converter

import com.cristiandpt.healthy.core.core.model.SpecialtyModel
import com.cristiandpt.infrastructure.database.entity.SpecialtyEntity
import org.springframework.core.convert.converter.Converter
import org.springframework.stereotype.Component

@Component
class SpecialtyEntityToModelConverter : Converter<SpecialtyEntity, SpecialtyModel> {
    override fun convert(source: SpecialtyEntity): SpecialtyModel {
        return SpecialtyModel(
                id = source.id,
                name = source.name,
                description = source.description,
                tenantId = source.tenantId,
                isActive = source.isActive,
                imageUrl = source.imageUrl,
                isDoctorManagedRate = source.isDoctorManagedRate,
                consultationRate = source.consultationRate,
                videoCallRate = source.videoCallRate,
                videoCallMinutes = source.videoCallMinutes
        )
    }
}

@Component
class SpecialtyModelToEntityConverter : Converter<SpecialtyModel, SpecialtyEntity> {
    override fun convert(source: SpecialtyModel): SpecialtyEntity {
        return SpecialtyEntity(
                id = source.id,
                name = source.name,
                description = source.description,
                tenantId = source.tenantId,
                isActive = source.isActive,
                imageUrl = source.imageUrl,
                isDoctorManagedRate = source.isDoctorManagedRate,
                consultationRate = source.consultationRate,
                videoCallRate = source.videoCallRate,
                videoCallMinutes = source.videoCallMinutes
        )
    }
}
