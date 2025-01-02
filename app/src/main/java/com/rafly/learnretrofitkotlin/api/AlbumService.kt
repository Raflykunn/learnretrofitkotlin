package com.rafly.learnretrofitkotlin.api

import com.rafly.learnretrofitkotlin.model.Albums
import retrofit2.Response
import retrofit2.http.GET

interface AlbumService {
    @GET("/albums")
    suspend fun getAlbums(): Response<Albums>
}