package com.cristiandpt.healthy.api.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "api.auth")
data class AuthEndpointsProperties(
        var login: String = "",
        var loginFacebook: String = "",
        var loginGoogle: String = "",
        var socialRegister: String = "",
        var register: String = ""
)
