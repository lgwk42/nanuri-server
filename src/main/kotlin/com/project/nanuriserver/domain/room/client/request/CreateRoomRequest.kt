package com.project.nanuriserver.domain.room.client.request

import com.project.nanuriserver.global.common.util.ValidateUUID

data class CreateRoomRequest(
    @field:ValidateUUID
    val uuid: String
)
