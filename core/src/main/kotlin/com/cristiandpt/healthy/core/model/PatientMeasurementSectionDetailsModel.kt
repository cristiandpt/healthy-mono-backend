package com.cristiandpt.healthy.core.model

data class PatientMeasurementSessionDetailsModel(
        val date: String,
        val patientName: String = "",
        val gender: String? = null,
        val bloodPressureMetric: BloodPressureMetricOutputModel? = null,
        val bodyCompositionMetric: BodyCompositionMetricOutputModel? = null
)
