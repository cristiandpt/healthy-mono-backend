package com.doctorhelp.domain.entities

import java.util.UUID

data class AuthProviderRegisterModel(
        val patientId: UUID,
        val firstName: String,
        val lastName: String,
        val cityId: Int = 1,
        val deviceId: String,
        val middleName: String = "",
        val motherLastName: String = "",
        val phoneNumber: String,
        val documentNumber: String,
        val documentTypeId: Int = 1
)
