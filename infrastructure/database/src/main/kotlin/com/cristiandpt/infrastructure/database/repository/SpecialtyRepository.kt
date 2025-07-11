package com.cristiandpt.healthy.database.repository

import com.cristiandpt.healthy.database.entity.SpecialtyEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository interface SpecialtyRepository : JpaRepository<SpecialtyEntity, String>
