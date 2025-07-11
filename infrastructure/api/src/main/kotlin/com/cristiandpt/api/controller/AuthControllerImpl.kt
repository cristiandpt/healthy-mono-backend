// AuthControllerImpl.kt
package com.cristiandpt.api.controller

import com.cristiandpt.api.endpoint.AuthController
import com.cristiandpt.healthy.core.service.AuthService
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthControllerImpl(private val authService: AuthService) : AuthController {

    override fun login(loginRequest: LoginRequest): String {
        return authService.login(loginRequest.username, loginRequest.password)
    }

    override fun loginFacebook(): String {
        return authService.loginFacebook()
    }

    override fun loginGoogle(): String {
        return authService.loginGoogle()
    }

    override fun socialRegister(registerRequest: RegisterRequest): String {
        return authService.socialRegister(registerRequest.username, registerRequest.email)
    }

    override fun register(registerRequest: RegisterRequest): String {
        return authService.register(
                registerRequest.username,
                registerRequest.password,
                registerRequest.email
        )
    }
}
