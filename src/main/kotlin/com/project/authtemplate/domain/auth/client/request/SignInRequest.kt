package com.project.authtemplate.domain.auth.client.request

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.Email

data class SignInRequest(
    @JsonProperty("email")
    val phoneNumber: String,
    @JsonProperty("password")
    val password: String
)