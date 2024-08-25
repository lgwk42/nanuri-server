package com.project.nanuriserver.domain.post.client.dto

import com.project.nanuriserver.domain.post.domain.entity.PostEntity
import com.project.nanuriserver.domain.post.domain.enum.Category
import org.springframework.stereotype.Component
import java.util.UUID

data class Post(

    val idx: Long? = null,
    val title: String,
    val content: String,
    val uuid: UUID,
    val imageUrl: String,
    val category: Category

) {

    @Component
    companion object{
        fun toUser(postEntity: PostEntity): Post {
            return Post(
                title = postEntity.title,
                content = postEntity.content,
                uuid = postEntity.uuid,
                imageUrl = postEntity.imageUrl,
                category = postEntity.category
            )
        }

        fun toEntity(post: Post): PostEntity {
            return PostEntity(
                title = post.title,
                content = post.content,
                uuid = post.uuid,
                imageUrl = post.imageUrl,
                category = post .category
            )
        }
    }

}
