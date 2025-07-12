package com.cristiandpt.healthy.core.model

import java.time.LocalDateTime
import java.util.UUID

data class UserModel(
        val id: UUID,
        val accessFailedCount: Int,
        val email: String?,
        val emailConfirmed: Boolean,
        val lockoutEnabled: Boolean,
        val lockoutEnd: LocalDateTime?,
        val normalizedEmail: String?,
        val normalizedUserName: String?,
        val phoneNumber: String?,
        val phoneNumberConfirmed: Boolean,
        val twoFactorEnabled: Boolean,
        val userName: String?,
        val displayName: String?
)
