package com.project.authtemplate.global.common.repository

import com.project.authtemplate.domain.user.dto.User
import com.project.authtemplate.global.security.auth.CustomUserDetails
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Repository

@Repository
class UserSecurityImpl : UserSecurity {

    override fun getUser(): User {
        val user: User = (SecurityContextHolder
            .getContext()
            .authentication
            .principal as CustomUserDetails).getUser()
        return user
    }

}