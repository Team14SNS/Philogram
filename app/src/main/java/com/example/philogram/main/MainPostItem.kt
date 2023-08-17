package com.example.philogram.main

import java.time.LocalDateTime

data class MainPostItem(
    val imgPostProfile: Int,
    val txtPostUserName: String,
    val imgPostPicture: Int,
    val txtPostContent: String,
    val postingDate: LocalDateTime
)
