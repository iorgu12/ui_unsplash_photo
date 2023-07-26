package com.example.composeapp.service

import com.example.composeapp.model.UnSplashPhotos
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApiService {

@Headers("Authorization: Client-ID gAO-ZgciNUpOq-3YBnEtyBaOvnyftX4moeaJ__-PBO4")
    @GET("/photos")
    suspend fun getPhotos(
        @Query("page") page : Int,
        @Query("per_page") per_page : Int
    ) : List<UnSplashPhotos>
}
