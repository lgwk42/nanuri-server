package com.project.nanuriserver.domain.room.domain.repository.jpa

import com.project.nanuriserver.domain.room.domain.entity.RoomEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface RoomJpaRepository : JpaRepository<RoomEntity, UUID>
