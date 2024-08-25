package com.project.nanuriserver.domain.room.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.UUID

@Entity(name = "tb_room")
data class RoomEntity(
    @Column(name = "user_first_id", nullable = false, updatable = false)
    val userFirst: UUID,

    @Column(name = "user_second_id", nullable = false, updatable = false)
    val userSecond: UUID,

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.UUID)
    private val _id: UUID? = null,
) {
    val id get() = _id!!
}
