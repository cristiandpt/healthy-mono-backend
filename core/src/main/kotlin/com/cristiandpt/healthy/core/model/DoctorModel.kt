package com.cristiandpt.healthy.core.model

import java.util.UUID

class DoctorModel(
        val id: UUID,
        val firstName: String?,
        val middleName: String?,
        val lastName: String?,
        val motherLastName: String?,
        val phoneNumber: String?,
        val cellphoneNumber: String?,
        val pictureUrl: String?,
        val emailAddress: String,
        val birthdate: String,
        val title: String,
        val shortName: String?,
        val longName: String?,
        val videoCallRate: Double?,
        val videoCallMinutes: Double
)
