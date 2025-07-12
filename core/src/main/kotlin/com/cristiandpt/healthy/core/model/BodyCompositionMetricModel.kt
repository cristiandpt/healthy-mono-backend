package com.cristiandpt.healthy.core.model

data class BodyCompositionMetricModel(
        val id: String,
        val date: String,
        val kioskDeviceId: Int,
        val batteryLevel: Int,
        val weightMeasure: Double,
        val bodyFatMeasure: Double,
        val height: Double,
        val visceralFatMeasure: Double,
        val bodyMassIndex: Double,
        val skeletalMusclePercentage: Double,
        val basalMetabolismMeasure: Double,
        val bodyFatStatus: Int,
        val visceralFatStatus: Int,
        val bodyMassIndexStatus: Int,
        val skeletalMuscleStatus: Int,
        val gender: Int?,
        val leadId: String
)
