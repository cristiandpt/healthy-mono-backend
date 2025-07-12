package com.cristiandpt.healthy.core.model

import java.math.BigDecimal
import java.util.UUID

data class AppointmentModel(
        val id: UUID,
        val starts: String,
        val ends: String,
        val reason: String?,
        val symptoms: String?,
        val doctor: DoctorModel?,
        val doctorId: UUID,
        val patientId: UUID,
        val videoCallId: String,
        val isPaid: Boolean,
        val cost: BigDecimal?
)
