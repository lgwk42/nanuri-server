package com.project.nanuriserver.global.exception.error

import org.springframework.http.HttpStatus

enum class HandleableErrorCode(override val message: String, override val status: HttpStatus) : ErrorProperty {
    PARAMETER_NOT_MATCH("파라미터 불일치: %s (%s)", HttpStatus.BAD_REQUEST),
    RESOURCE_NOT_FOUND("리소스 '/%s' 를 찾을 수 없음", HttpStatus.NOT_FOUND),
    INVALID_PARAMETER("잘못된 파라미터 (%s)", HttpStatus.BAD_REQUEST),
    UNPROCESSABLE_BODY("요청 바디가 없거나 읽을 수 없음", HttpStatus.BAD_REQUEST),
    UNSUPPORTED_MEDIA_TYPE("미디어 '%s'는 지원되지 않음. (지원하는 미디어: '%s')", HttpStatus.BAD_REQUEST),
    METHOD_NOT_SUPPORTED("메소드 '%s'(은)는 지원되지 않음. (지원하는 메소드: '%s')", HttpStatus.NOT_FOUND),
    NO_HANDLER_FOUND("요청한 url '%s'를 찾을 수 업음", HttpStatus.NOT_FOUND)

    ;

    override val code: String
        get() = name
}
