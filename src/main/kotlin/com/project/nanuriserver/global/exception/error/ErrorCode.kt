package com.project.nanuriserver.global.exception.error

import org.springframework.http.HttpStatus

enum class ErrorCode(
    override val status: HttpStatus,
    override val message: String
) : ErrorProperty {

    BAD_REQUEST(HttpStatus.BAD_REQUEST, "잘못된 요청입니다."),
    ACCESS_DENIED(HttpStatus.BAD_REQUEST, "접근 요청이 거부되었습니다."),
    NOT_FOUND(HttpStatus.NOT_FOUND, "리소스를 찾을 수 없습니다.");

}
