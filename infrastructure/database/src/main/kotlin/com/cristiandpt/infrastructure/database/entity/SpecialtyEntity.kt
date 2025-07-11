import jakarta.persistence.*
import jakarta.validation.constraints.*

@Entity
@Table(name = "specialties")
data class SpecialtyEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        val id: Long = 0,
        @Column(name = "name", nullable = false)
        @NotBlank(message = "Name is required")
        @Size(max = 100, message = "Name must be less than or equal to 100 characters")
        val name: String,
        @Column(name = "description", nullable = false, columnDefinition = "TEXT")
        @NotBlank(message = "Description is required")
        val description: String,
        @Column(name = "tenant_id", nullable = false)
        @NotNull(message = "Tenant ID is required")
        val tenantId: Int,
        @Column(name = "is_active", nullable = false)
        @NotNull(message = "Active status is required")
        val isActive: Boolean,
        @Column(name = "image_url", nullable = false, length = 2048)
        @NotBlank(message = "Image URL is required")
        @Size(max = 2048, message = "Image URL must be less than or equal to 2048 characters")
        val imageUrl: String,
        @Column(name = "is_doctor_managed_rate", nullable = false)
        @NotNull(message = "Doctor managed rate status is required")
        val isDoctorManagedRate: Boolean,
        @Column(name = "consultation_rate", nullable = false, precision = 2)
        @NotNull(message = "Consultation rate is required")
        @PositiveOrZero(message = "Consultation rate must be a positive value")
        val consultationRate: Double,
        @Column(name = "video_call_rate", nullable = false, precision = 2)
        @NotNull(message = "Video call rate is required")
        @PositiveOrZero(message = "Video call rate must be a positive value")
        val videoCallRate: Double,
        @Column(name = "video_call_minutes", nullable = false)
        @NotNull(message = "Video call minutes is required")
        @Positive(message = "Video call minutes must be a positive value")
        val videoCallMinutes: Int
)
