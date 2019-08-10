package com.example.githubapp

import com.google.gson.annotations.SerializedName

data class Usuario(
    val name: String,
    @SerializedName("avatar_url") val avatarURL:String
)