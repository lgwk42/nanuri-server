package com.project.authtemplate.domain.post.service

import com.project.authtemplate.domain.user.domain.repository.jpa.UserJpaRepository
import com.project.authtemplate.global.common.repository.UserSecurity
import org.springframework.stereotype.Service

@Service
class PostService(
    private val userJpaRepository: UserJpaRepository,
    private val userSecurity: UserSecurity
) {

    fun registerPost(){

    }

}