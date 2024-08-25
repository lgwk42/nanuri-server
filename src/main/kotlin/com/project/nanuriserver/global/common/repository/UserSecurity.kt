package com.project.nanuriserver.global.common.repository

import com.project.nanuriserver.domain.user.dto.User

interface UserSecurity {

    fun getUser(): User

}