package com.cristiandpt.healthy.core.model

import java.util.UUID

data class DoctorProfileModel(
        val id: UUID,
        val pictureUrl: String?,
        val shortName: String,
        val title: String,
        val rate: Float,
        val opinionsQuantity: Int?,
        val biography: String? = "",
        val spokenLanguages: String,
        val consultationRate: Double,
        val videoCallRate: Double,
        val videoCallMinutes: Int,
        val latitude: Double?,
        val longitude: Double?,
        val address: String?,
        val city: String,
        val specialtiesList: List<String>?,
        val subjectsList: List<String>?,
        val grades: List<DoctorProfileGradeModel>?,
        val opinions: List<DoctorProfileOpinionModel>?
)
