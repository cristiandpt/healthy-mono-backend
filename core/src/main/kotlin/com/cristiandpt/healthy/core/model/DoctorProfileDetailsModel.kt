package com.cristiandpt.healthy.core.model

data class ProfileDetail(
        val biography: String?,
        val specialtiesList: List<String>? = null,
        val subjectsList: List<String>? = null,
        val grades: List<DoctorProfileGradeModel>? = null,
        val spokenLanguages: String = ""
)
