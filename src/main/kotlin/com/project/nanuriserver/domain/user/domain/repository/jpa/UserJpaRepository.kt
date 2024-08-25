package com.project.nanuriserver.domain.user.domain.repository.jpa

import com.project.nanuriserver.domain.user.domain.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface UserJpaRepository : JpaRepository<UserEntity, Long> {
    fun findByPhoneNumber(phoneNumber: String): Optional<UserEntity>
    fun existsByPhoneNumber(phoneNumber: String): Boolean
}