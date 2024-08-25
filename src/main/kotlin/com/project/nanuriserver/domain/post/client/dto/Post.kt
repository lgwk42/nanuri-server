package com.project.nanuriserver.domain.post.client.dto

data class Post(
    var idx:Long,
    var title: String,
    var content: String,
    var imageUrl: String,
    var writer: String,
    var category: CharCategory
) {



}