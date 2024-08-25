package com.project.nanuriserver.domain.post.domain.entity

import com.project.nanuriserver.domain.post.domain.enum.Category
import com.project.nanuriserver.global.common.entity.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class PostEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idx: Long? = null,

    @Column(nullable = false)
    val title: String,

    @Column(nullable = false)
    val content: String,

    @Column(nullable = false)
    val author: String,

    val imageUrl: String,

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    val category: Category

): BaseEntity()