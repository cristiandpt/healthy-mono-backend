package com.cristiandpt.healthy.core.model

data class DoctorProfileOpinionModel(
        val rate: Double,
        val comment: String,
        val drComment: String,
        val patient: String,
        val patientPictureUrl: String
)
