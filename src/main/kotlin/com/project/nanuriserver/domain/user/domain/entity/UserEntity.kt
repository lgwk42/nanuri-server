package com.project.nanuriserver.domain.user.domain.entity

import com.project.nanuriserver.global.common.entity.BaseEntity
import com.project.nanuriserver.domain.user.domain.enum.UserRole
import jakarta.persistence.*
import lombok.experimental.SuperBuilder
import org.hibernate.annotations.DynamicUpdate
import java.util.UUID

@Entity
@SuperBuilder
@DynamicUpdate
@Table(name = "tb_user")
data class UserEntity(
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
    val userRole: UserRole,

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.UUID)
    private var _uuid: UUID? = null,
) : BaseEntity() {
    val uuid get() = _uuid!!
}
