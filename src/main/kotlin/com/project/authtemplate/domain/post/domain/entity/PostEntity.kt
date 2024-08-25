package com.project.authtemplate.domain.post.domain.entity

import com.project.authtemplate.global.common.entity.BaseEntity
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
    var idx:Long,

    @Column(nullable = false)
    var title: String,

    @Column(nullable = false)
    var content: String,

    var imageUrl: String,

    @Column(nullable = false)
    var writer: String,

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    var category: CharCategory

): BaseEntity()