package com.cristiandpt.healthy.core.core.model

import java.util.UUID

data class UserEntity(
        val id: UUID,
        val accessFailedCount: Int,
        val email: String?,
        val emailConfirmed: Boolean,
        val lockoutEnabled: Boolean,
        val lockoutEnd: java.util.Date?,
        val normalizedEmail: String?,
        val normalizedUserName: String?,
        val phoneNumber: String?,
        val phoneNumberConfirmed: Boolean,
        val twoFactorEnabled: Boolean,
        val userName: String?,
        val displayName: String?
)
