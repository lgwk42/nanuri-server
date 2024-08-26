package com.project.nanuriserver.domain.post.service

import com.project.nanuriserver.domain.post.client.dto.request.PostRegisterRequest
import com.project.nanuriserver.domain.post.domain.entity.PostEntity
import com.project.nanuriserver.domain.post.domain.enum.Status
import com.project.nanuriserver.domain.post.domain.repository.jpa.PostJpaRepository
import com.project.nanuriserver.global.common.repository.UserSecurity
import org.springframework.stereotype.Service

@Service
class PostService(
    private val postJpaRepository: PostJpaRepository,
    private val userSecurity: UserSecurity
) {

    fun registerPost(request: PostRegisterRequest) {
        postJpaRepository.save(
            PostEntity(
                title = request.title,
                content = request.content,
                author = userSecurity.getUser().uuid,
                imageUrl = request.imageUrl,
                status = Status.PROGRESS,
                category = request.category,
            )
        )
    }
}
