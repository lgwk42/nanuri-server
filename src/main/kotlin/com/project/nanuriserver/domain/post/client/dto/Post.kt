package com.project.nanuriserver.domain.post.client.dto

import com.project.nanuriserver.domain.post.domain.entity.PostEntity
import com.project.nanuriserver.domain.post.domain.enum.Category
import java.util.*

data class Post(

    val id: Long,
    val title: String,
    val content: String,
    val author: UUID,
    val imageUrl: String,
    val category: Category

) {

    companion object {
        fun toPost(postEntity: PostEntity): Post {
            return Post(
                title = postEntity.title,
                content = postEntity.content,
                author = postEntity.author,
                imageUrl = postEntity.imageUrl,
                category = postEntity.category,
                id = postEntity.id
            )
        }
    }
}
