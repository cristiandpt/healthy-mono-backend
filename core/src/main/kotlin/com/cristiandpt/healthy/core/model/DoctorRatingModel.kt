package com.cristiandpt.healthy.core.model

import java.util.UUID

data class RatingDoctor(
        val doctorId: UUID,
        val rate: Double,
        val comments: String,
        val patientName: String
)
