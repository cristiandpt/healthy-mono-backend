package com.doctorhelp.domain.entities

import java.util.UUID

data class PatientMeasurementSectionItemModel(
        val patientId: UUID,
        val date: String,
        val type: String
)
