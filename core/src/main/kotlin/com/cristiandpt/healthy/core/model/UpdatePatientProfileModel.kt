package com.doctorhelp.domain.entities

data class UpdatePatientDataModel(
        var firstName: String,
        var middleName: String = "",
        var lastName: String,
        var motherLastName: String = "",
        val documentTypeId: Int,
        val documentNumber: String,
        val cellphoneNumber: String,
        val address: String,
        val birthDate: String = "",
        val cityId: Int,
        val shortName: String = "$firstName $lastName",
        val gender: Int = 0,
        var pictureUrl: String? = null,
)
