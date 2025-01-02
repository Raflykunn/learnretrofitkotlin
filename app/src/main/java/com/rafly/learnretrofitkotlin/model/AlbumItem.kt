package com.rafly.learnretrofitkotlin.model

import java.io.Serializable

data class AlbumItem(
    val userId: Int,
    val id: Int,
    val title: String
): Serializable
