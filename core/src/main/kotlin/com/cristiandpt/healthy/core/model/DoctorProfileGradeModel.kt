package com.cristiandpt.healthy.core.model

data class DoctorProfileModel(
        val id: Int,
        val pictureUrl: String?,
        val shortName: String,
        val title: String,
        val rate: Float,
        val opinionsQuantity: Int?,
        val biography: String? = EMPTY,
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
