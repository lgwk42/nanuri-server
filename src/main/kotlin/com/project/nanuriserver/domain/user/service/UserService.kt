package com.project.nanuriserver.domain.user.service

import com.project.nanuriserver.domain.post.client.dto.Post
import com.project.nanuriserver.domain.post.domain.repository.jpa.PostJpaRepository
import com.project.nanuriserver.domain.user.client.dto.User
import com.project.nanuriserver.domain.user.domain.repository.jpa.UserJpaRepository
import com.project.nanuriserver.global.common.repository.UserSecurity
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userJpaRepository: UserJpaRepository,
    private val postJpaRepository: PostJpaRepository,
    private val userSecurity: UserSecurity
) {

    fun getUser(): User {
        return userSecurity.getUser()
    }

    fun findMyPost(): List<Post>{
        return postJpaRepository
            .findAllByAuthor(userSecurity.getUser().uuid)
            .map { postEntity -> Post.toPost(postEntity) }
    }

}