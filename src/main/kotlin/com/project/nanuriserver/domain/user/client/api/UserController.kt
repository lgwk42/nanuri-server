package com.project.nanuriserver.domain.user.client.api

import com.project.nanuriserver.domain.post.client.dto.Post
import com.project.nanuriserver.domain.user.client.dto.User
import com.project.nanuriserver.domain.user.service.UserService
import com.project.nanuriserver.global.common.dto.response.BaseResponseData
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
@Tag(name = "유저 API")
class UserController(
    private val userService: UserService
) {

    @GetMapping("")
    @Operation(summary = "유저 프로필 조회")
    fun getUser(): BaseResponseData<User>{
        return BaseResponseData.ok(
            message = "유저 프로필 조회 성공",
            data = userService.getUser())
    }

    @GetMapping("/my-post")
    @Operation(summary = "내 게시글 조회")
    fun getMyPost(): BaseResponseData<List<Post>> {
        return BaseResponseData.ok(
            message = "나의 게시물 불러오기 성공",
            data = userService.findMyPost())
    }

}