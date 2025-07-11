package com.cristiandpt.healthy.core.service

interface AuthService {
    fun login(username: String, password: String): String
    fun loginFacebook(): String
    fun loginGoogle(): String
    fun socialRegister(username: String, email: String): String
    fun register(username: String, password: String, email: String): String
}
