package com.example.estudocleanmvvm.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Info(
        @SerialName("count")
        val count: Int = 0,
        @SerialName("next")
        val next: String = "",
        @SerialName("pages")
        val pages: Int = 0,
        @SerialName("prev")
        val prev: Any? = null
)

@Serializable
data class Results(
        @SerialName("created")
        val created: String = "",
        @SerialName("episode")
        val episode: List<String> = listOf(),
        @SerialName("gender")
        val gender: String = "",
        @SerialName("id")
        val id: Int = 0,
        @SerialName("image")
        val image: String = "",
        @SerialName("location")
        val location: Location = Location(),
        @SerialName("name")
        val name: String = "",
        @SerialName("origin")
        val origin: Origin = Origin(),
        @SerialName("species")
        val species: String = "",
        @SerialName("status")
        val status: String = "",
        @SerialName("type")
        val type: String = "",
        @SerialName("url")
        val url: String = ""
)
        @Serializable
        data class Location(
            @SerialName("name")
            val name: String = "",
            @SerialName("url")
            val url: String = ""
        )

        @Serializable
        data class Origin(
            @SerialName("name")
            val name: String = "",
            @SerialName("url")
            val url: String = ""
        )