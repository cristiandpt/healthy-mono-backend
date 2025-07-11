package com.cristiandpt.api.endpoint

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/api/authentication/account")
interface AuthController {

    @PostMapping("/login") fun login(@RequestBody loginRequest: LoginRequest): String

    @PostMapping("/login/facebook") fun loginFacebook(): String

    @PostMapping("/login/google") fun loginGoogle(): String

    @PostMapping("/social-register")
    fun socialRegister(@RequestBody registerRequest: RegisterRequest): String

    @PostMapping("/register") fun register(@RequestBody registerRequest: RegisterRequest): String
}
