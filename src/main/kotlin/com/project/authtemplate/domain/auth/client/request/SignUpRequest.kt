package com.project.authtemplate.domain.auth.client.request

import com.fasterxml.jackson.annotation.JsonProperty

data class SignUpRequest(
    @JsonProperty("phoneNumber")
    val phoneNumber: String,
    @JsonProperty("name")
    val name: String,
    @JsonProperty("password")
    val password: String,
    @JsonProperty("latitude")
    var latitude: String,
    @JsonProperty("longitude")
    var longitude: String
)