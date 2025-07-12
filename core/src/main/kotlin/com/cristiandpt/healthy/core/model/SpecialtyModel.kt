package com.cristiandpt.healthy.core.model

data class SpecialtyModel(
        val id: Long,
        val name: String,
        val description: String,
        val tenantId: Int,
        val isActive: Boolean,
        val imageUrl: String,
        val isDoctorManagedRate: Boolean,
        val consultationRate: Double,
        val videoCallRate: Double,
        val videoCallMinutes: Int
)
