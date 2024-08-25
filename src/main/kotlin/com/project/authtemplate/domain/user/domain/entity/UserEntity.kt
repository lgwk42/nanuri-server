package com.project.authtemplate.domain.user.domain.entity

import com.project.authtemplate.global.common.entity.BaseEntity
import com.project.authtemplate.domain.user.domain.enum.UserRole
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.Id
import jakarta.persistence.Table
import lombok.experimental.SuperBuilder
import org.hibernate.annotations.DynamicUpdate

@Entity
@SuperBuilder
@DynamicUpdate
@Table(name = "tb_user")
data class UserEntity(

    @Id
    @Column(nullable = false, unique = true)
    var phoneNumber: String,

    @Column(nullable = false)
    var name: String,

    @Column(nullable = false)
    var password: String,

    @Column(nullable = false)
    var latitude: Double,

    @Column(nullable = false)
    var longitude: Double,

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    val userRole: UserRole

) : BaseEntity()