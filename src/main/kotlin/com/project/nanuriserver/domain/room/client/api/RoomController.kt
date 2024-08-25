package com.project.nanuriserver.domain.room.client.api

import com.project.nanuriserver.domain.room.client.request.CreateRoomRequest
import com.project.nanuriserver.domain.room.client.request.EditRoomRequest
import com.project.nanuriserver.domain.room.service.RoomService
import com.project.nanuriserver.global.common.dto.response.BaseResponseData
import com.project.nanuriserver.global.common.util.UUIDSafe
import io.swagger.v3.oas.annotations.Operation
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.UUID

@RestController
@RequestMapping("/room")
class RoomController(
    private val roomService: RoomService
) {
    @PostMapping
    @Operation(summary = "채팅방 생성")
    @ResponseStatus(HttpStatus.CREATED)
    fun createRoom(@Valid request: CreateRoomRequest): BaseResponseData<UUID> {
        val userId = UUIDSafe(request.uuid)
        val createdUuid = roomService.createRoom(userId)
        return BaseResponseData.of(HttpStatus.CREATED, "방이 생성 되었습니다.", createdUuid)
    }

    @PatchMapping("/{uuid}")
    @Operation(summary = "채팅방 수정")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun edit(@PathVariable uuid: String, @Valid request: EditRoomRequest) {
        val roomId = UUIDSafe(uuid)
        roomService.editTitle(roomId, request.title)
    }

    @GetMapping
    @Operation(summary = "채팅방 리스트")
    fun rooms() {
        roomService.getRooms()
    }
}
