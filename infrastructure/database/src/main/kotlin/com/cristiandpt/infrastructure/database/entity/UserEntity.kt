package com.cristiandpt.infrastructure.database.entity

import jakarta.persistence.*
import jakarta.validation.constraints.*
import java.time.LocalDateTime
import java.util.*

@Entity
@Table(name = "users")
data class User(
        @Id
        @Column(name = "id", columnDefinition = "UUID default random_uuid()", nullable = false)
        val id: UUID = UUID.randomUUID(),
        @Column(name = "access_failed_count", nullable = false)
        @NotNull(message = "Access failed count is required")
        val accessFailedCount: Int,
        @Column(name = "concurrency_stamp", columnDefinition = "UUID") val concurrencyStamp: UUID?,
        @Column(name = "email", length = 256)
        @Email(message = "Email should be valid")
        val email: String?,
        @Column(name = "email_confirmed", nullable = false)
        @NotNull(message = "Email confirmed status is required")
        val emailConfirmed: Boolean,
        @Column(name = "lockout_enabled", nullable = false)
        @NotNull(message = "Lockout enabled status is required")
        val lockoutEnabled: Boolean,
        @Column(name = "lockout_end") val lockoutEnd: LocalDateTime?,
        @Column(name = "normalized_email", length = 256) val normalizedEmail: String?,
        @Column(name = "normalized_user_name", length = 256) val normalizedUserName: String?,
        @Column(name = "password_hash", columnDefinition = "TEXT") val passwordHash: String?,
        @Column(name = "phone_number", columnDefinition = "TEXT") val phoneNumber: String?,
        @Column(name = "phone_number_confirmed", nullable = false)
        @NotNull(message = "Phone number confirmed status is required")
        val phoneNumberConfirmed: Boolean,
        @Column(name = "security_stamp", columnDefinition = "UUID") val securityStamp: UUID?,
        @Column(name = "two_factor_enabled", nullable = false)
        @NotNull(message = "Two factor enabled status is required")
        val twoFactorEnabled: Boolean,
        @Column(name = "user_name", length = 256) val userName: String?,
        @Column(name = "display_name", length = 256) val displayName: String?
)
