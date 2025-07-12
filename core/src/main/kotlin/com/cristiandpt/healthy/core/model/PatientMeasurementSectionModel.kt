package com.cristiandpt.healthy.core.model

import java.util.UUID

data class PatientMeasurementSectionModel(val patientId: UUID, val date: String, val type: String)
