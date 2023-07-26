package com.example.composeapp.model

data class UnSplashPhotos(
    val id : String,
    val urls : UnSplashUrl
)

data class UnSplashUrl(
    val regular : String
)