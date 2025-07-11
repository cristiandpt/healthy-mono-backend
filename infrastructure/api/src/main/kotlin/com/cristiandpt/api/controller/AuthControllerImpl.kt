// AuthControllerImpl.kt
package com.cristiandpt.api.controller

import com.cristiandpt.api.endpoint.AuthEndpoints
import com.cristiandpt.core.service.AuthService
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthControllerImpl(private val authService: AuthService) : AuthEndpoints {

    override fun login(loginRequest: String): String {
        return authService.login("loginRequest.username", "loginRequest.password")
    }

    override fun loginFacebook(): String {
        return authService.loginFacebook()
    }

    override fun loginGoogle(): String {
        return authService.loginGoogle()
    }

    override fun socialRegister(registerRequest: String): String {
        return authService.socialRegister("registerRequest.username", "registerRequest.email")
    }

    override fun register(registerRequest: String): String {
        return authService.register(
                "registerRequest.username",
                "registerRequest.password",
                "registerRequest.email"
        )
    }
}
