package com.example.composeapp.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitService {
    private const val BASE_URL = "https://api.unsplash.com/"

    private val retrofitClient: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val unsplashApiService: UnsplashApiService by lazy {
        retrofitClient.create(UnsplashApiService::class.java)
    }
}