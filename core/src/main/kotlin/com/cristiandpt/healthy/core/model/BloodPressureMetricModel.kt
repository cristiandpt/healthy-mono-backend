package com.cristiandpt.healthy.core.model

data class BloodPressureMetricModel(
        val id: String,
        val date: String,
        val kioskDeviceId: Int,
        val batteryLevel: Int,
        val systolicMeasure: Double,
        val diastolicMeasure: Double,
        val pulseRateMeasure: Double,
        val systolicStatus: Int,
        val diastolicStatus: Int
)
