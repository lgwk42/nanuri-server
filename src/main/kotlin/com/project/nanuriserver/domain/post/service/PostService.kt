package com.project.nanuriserver.domain.post.service

import com.project.nanuriserver.domain.user.domain.repository.jpa.UserJpaRepository
import com.project.nanuriserver.global.common.repository.UserSecurity
import org.springframework.stereotype.Service

@Service
class PostService(
    private val userJpaRepository: UserJpaRepository,
    private val userSecurity: UserSecurity
) {

    fun registerPost(){

    }

}