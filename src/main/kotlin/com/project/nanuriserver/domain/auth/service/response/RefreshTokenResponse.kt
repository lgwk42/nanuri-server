package com.project.nanuriserver.domain.auth.service.response

import com.fasterxml.jackson.annotation.JsonInclude
import lombok.Builder

@Builder
@JsonInclude(JsonInclude.Include.NON_EMPTY)
data class RefreshTokenResponse(
    val accessToken: String
)