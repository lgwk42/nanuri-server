package com.project.nanuriserver.domain.post.client.dto

import com.project.nanuriserver.domain.post.domain.entity.PostEntity
import com.project.nanuriserver.domain.post.domain.enum.Category
import com.project.nanuriserver.domain.post.domain.enum.Status
import java.util.*

data class Post(

    val id: Long,
    val title: String,
    val content: String,
    val author: UUID,
    val imageUrl: String,
    val category: Category,
    val status: Status

    ) {

    companion object {
        fun toPost(postEntity: PostEntity): Post {
            return Post(
                title = postEntity.title,
                content = postEntity.content,
                author = postEntity.author,
                imageUrl = postEntity.imageUrl,
                category = postEntity.category,
                status = postEntity.status,
                id = postEntity.id
            )
        }
    }
}
