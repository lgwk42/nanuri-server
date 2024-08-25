package com.project.nanuriserver.domain.room.service

import com.project.nanuriserver.domain.room.domain.entity.RoomEntity
import com.project.nanuriserver.domain.room.domain.repository.jpa.RoomJpaRepository
import com.project.nanuriserver.domain.room.exception.RoomNotFoundException
import com.project.nanuriserver.domain.user.domain.repository.jpa.UserJpaRepository
import com.project.nanuriserver.domain.user.exception.UserNotFoundException
import com.project.nanuriserver.global.common.repository.UserSecurity
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.util.*

@Service
class RoomService(
    private val roomRepository: RoomJpaRepository,
    private val userRepository: UserJpaRepository,
    private val loginUser: UserSecurity,
) {
    fun createRoom(userId: UUID): UUID {
        if (!userRepository.existsById(userId))
            throw UserNotFoundException

        val ent = roomRepository.save(
            RoomEntity(
                userFirst = loginUser.getUser().uuid,
                userSecond = userId,
            )
        )

        return ent.id
    }

    fun editTitle(roomId: UUID, title: String?) {
        val room = roomRepository.findByIdOrNull(roomId)
            ?: throw RoomNotFoundException

        roomRepository.save(room.copy(title = title))
    }

    fun getRooms() {
        TODO("Create after implement Kotlin JPQL")
    }
}
