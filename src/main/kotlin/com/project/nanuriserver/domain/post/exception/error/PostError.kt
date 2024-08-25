package com.project.nanuriserver.domain.post.exception.error

import com.project.nanuriserver.global.exception.error.ErrorProperty
import org.springframework.http.HttpStatus

enum class PostError(override val status: HttpStatus, override val message: String) : ErrorProperty {

    POST_NOT_FOUND(HttpStatus.NOT_FOUND, "게시글을 찾을 수 없습니다."),

}