package com.cristiandpt.healthy.core.model

data class AddMedicalExamOrderModel(
        val videoCallConsultationId: String = "",
        val isDelivery: Boolean = false,
        val comments: String = "",
        val agreementId: String = "",
        val agreementBranchId: Int? = null,
        val patientAddressId: String? = null,
        val medicalExamDifficultConditionId: Int = 1,
        val medicalExamDifficultConditionComments: String = "",
        val examsList: List<ExamModel> = listOf()
)
