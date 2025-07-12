package com.cristiandpt.healthy.core.model

data class RegisterModel(
        val firstName: String,
        val middleName: String = "",
        val lastName: String,
        val motherLastName: String = "",
        val userName: String,
        val password: String,
        val countryId: Int = 1,
        val phoneNumber: String,
        val documentNumber: String,
        val documentTypeId: Int,
        val email: String
)
