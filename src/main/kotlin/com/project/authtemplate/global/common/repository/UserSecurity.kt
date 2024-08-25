package com.project.authtemplate.global.common.repository

import com.project.authtemplate.domain.user.dto.User

interface UserSecurity {

    fun getUser(): User

}