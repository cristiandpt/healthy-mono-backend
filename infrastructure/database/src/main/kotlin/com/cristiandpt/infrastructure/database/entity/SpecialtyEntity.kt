package com.cristiandpt.healthy.database.entity

import jakarta.persistence.*
import jakarta.validation.constraints.*

@Entity
@Table(name = "specialties")
data class SpecialtyEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        var id: Long = 0, // <--- CHANGE to 'var' and provide a default value
        @Column(name = "name", nullable = false)
        @NotBlank(message = "Name is required")
        @Size(max = 100, message = "Name must be less than or equal to 100 characters")
        var name: String =
                "", // <--- CHANGE to 'var' and provide a default value (e.g., empty string)
        @Column(name = "description", nullable = false, columnDefinition = "TEXT")
        @NotBlank(message = "Description is required")
        var description: String = "", // <--- CHANGE to 'var' and provide a default value
        @Column(name = "tenant_id", nullable = false)
        @NotNull(message = "Tenant ID is required")
        var tenantId: Int = 0, // <--- CHANGE to 'var' and provide a default value
        @Column(name = "is_active", nullable = false)
        @NotNull(message = "Active status is required")
        var isActive: Boolean = false, // <--- CHANGE to 'var' and provide a default value
        @Column(name = "image_url", nullable = false, length = 2048)
        @NotBlank(message = "Image URL is required")
        @Size(max = 2048, message = "Image URL must be less than or equal to 2048 characters")
        var imageUrl: String = "", // <--- CHANGE to 'var' and provide a default value
        @Column(name = "is_doctor_managed_rate", nullable = false)
        @NotNull(message = "Doctor managed rate status is required")
        var isDoctorManagedRate: Boolean =
                false, // <--- CHANGE to 'var' and provide a default value
        @Column(name = "consultation_rate", nullable = false, precision = 2)
        @NotNull(message = "Consultation rate is required")
        @PositiveOrZero(message = "Consultation rate must be a positive value")
        var consultationRate: Double = 0.0, // <--- CHANGE to 'var' and provide a default value
        @Column(name = "video_call_rate", nullable = false, precision = 2)
        @NotNull(message = "Video call rate is required")
        @PositiveOrZero(message = "Video call rate must be a positive value")
        var videoCallRate: Double = 0.0, // <--- CHANGE to 'var' and provide a default value
        @Column(name = "video_call_minutes", nullable = false)
        @NotNull(message = "Video call minutes is required")
        @Positive(message = "Video call minutes must be a positive value")
        var videoCallMinutes: Int = 0 // <--- CHANGE to 'var' and provide a default value
) {
    // You might also add a secondary constructor if needed for specific use cases
    // but often not required if all fields have defaults.
}
