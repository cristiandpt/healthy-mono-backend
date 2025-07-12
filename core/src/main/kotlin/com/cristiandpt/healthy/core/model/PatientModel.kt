package com.cristiandpt.healthy.core.model

data class PatientModel(
        val id: Int,
        val firstName: String?,
        val middleName: String? = "",
        val lastName: String? = "",
        val motherLastName: String? = "",
        val documentTypeId: Int?,
        val documentNumber: String?,
        val phoneNumber: String?,
        val cellphoneNumber: String?,
        val address: String?,
        val birthdate: String?,
        val cityId: Int,
        val address2: String? = "",
        val shortName: String?,
        val gender: Int?,
        val pictureUrl: String? = "",
        val emailAddress: String,
        val agreementName: String? = ""
)
