package com.project.nanuriserver.domain.room.client.request

import jakarta.validation.constraints.Max
import jakarta.validation.constraints.NotBlank

data class EditRoomRequest(
    @field:NotBlank
    @field:Max(64)
    val title: String? = null
)
