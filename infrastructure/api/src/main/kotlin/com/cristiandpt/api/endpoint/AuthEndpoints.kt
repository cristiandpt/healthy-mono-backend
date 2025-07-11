package com.cristiandpt.api.endpoint

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("\${api.auth.base-path}")
interface AuthEndpoints {

    @PostMapping("\${api.auth.login}") fun login(@RequestBody loginRequest: String): String

    @PostMapping("\${api.auth.login-facebook}") fun loginFacebook(): String

    @PostMapping("\${api.auth.login-google}") fun loginGoogle(): String

    @PostMapping("\${api.auth.social-register}")
    fun socialRegister(@RequestBody registerRequest: String): String

    @PostMapping("\${api.auth.register}") fun register(@RequestBody registerRequest: String): String
}
