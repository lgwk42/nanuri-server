package com.project.nanuriserver.domain.post.client.api

import com.project.nanuriserver.domain.post.client.dto.request.PostRegisterRequest
import com.project.nanuriserver.domain.post.service.PostService
import com.project.nanuriserver.global.common.dto.response.BaseResponse
import io.swagger.v3.oas.annotations.Operation
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/post")
class PostController(
    private val postService: PostService
) {

    @PostMapping("")
    @Operation(summary = "게시글 등록")
    fun registerPost(request: PostRegisterRequest): BaseResponse {
        postService.registerPost(request)
        return BaseResponse.ok(message = "게시글 등록 성공")
    }

}