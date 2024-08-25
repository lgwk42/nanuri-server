package com.project.authtemplate.domain.user.dto

import com.project.authtemplate.domain.user.domain.entity.UserEntity
import com.project.authtemplate.domain.user.domain.enum.UserRole
import org.springframework.stereotype.Component

data class User(

    val phoneNumber: String,
    val name: String,
    val password: String,
    var latitude: String,
    var longitude: String,
    val userRole: UserRole

){

    @Component
    companion object{
        fun toUser(userEntity: UserEntity): User {
            return User(
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