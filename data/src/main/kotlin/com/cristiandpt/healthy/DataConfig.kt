// health-mono-backend/app/src/main/kotlin/com/cristiandpt/health/config/DomainServiceConfig.kt
package com.cristiandpt.healthy.data.config

import com.cristiandpt.healthy.core.service.SpecialtyService
import com.cristiandpt.healthy.data.SpecialtyServiceImpl
import com.cristiandpt.healthy.database.repository.SpecialtyRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.convert.ConversionService

@Configuration
class DataServiceConfig
constructor(
        private val repository: SpecialtyRepository,
        private val conversionService: ConversionService
) {

    @Bean
    fun specialtyService(): SpecialtyService {
        return SpecialtyServiceImpl(repository, conversionService)
    }
}
