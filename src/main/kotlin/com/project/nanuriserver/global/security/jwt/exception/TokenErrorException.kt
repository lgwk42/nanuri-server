package com.project.nanuriserver.global.security.jwt.exception

import com.project.nanuriserver.global.exception.BusinessException
import com.project.nanuriserver.global.security.jwt.exception.error.JwtTokenError

object TokenErrorException : BusinessException(JwtTokenError.JWT_TOKEN_ERROR) {

    private fun readResolve(): Any = TokenErrorException

    val EXCEPTION: TokenErrorException = TokenErrorException

}