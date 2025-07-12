package com.cristiandpt.healthy.core.model

import java.util.UUID

class AddAppointmentModel(
        val doctorId: UUID,
        val patientId: UUID,
        val starts: String,
        val ends: String,
        val reason: String,
        val symptoms: String,
        val deviceId: String,
        val specialtyId: Int
)
