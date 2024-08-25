package com.project.nanuriserver.domain.user.dto

import com.project.nanuriserver.domain.user.domain.entity.UserEntity
import com.project.nanuriserver.domain.user.domain.enum.UserRole
import org.springframework.stereotype.Component
import java.util.UUID

data class User(

    val uuid: UUID,
    val phoneNumber: String,
    val name: String,
    val password: String,
    var latitude: Double,
    var longitude: Double,
    val userRole: UserRole

){

    @Component
    companion object{
        fun toUser(userEntity: UserEntity): User {
            return User(
                uuid = userEntity.uuid,
                phoneNumber = userEntity.phoneNumber,
                name = userEntity.name,
                password = userEntity.password,
                latitude = userEntity.latitude,
                longitude = userEntity.longitude,
                userRole = userEntity.userRole
            )
        }

        fun toEntity(user: User): UserEntity {
            return UserEntity(
                uuid = user.uuid,
                phoneNumber = user.phoneNumber,
                name = user.name,
                password = user.password,
                latitude = user.latitude,
                longitude = user.longitude,
                userRole = user.userRole
            )
        }
    }

}