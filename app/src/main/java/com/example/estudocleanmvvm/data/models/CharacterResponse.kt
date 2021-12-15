package com.example.estudocleanmvvm.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.Result

@Serializable
data class CharacterResponse(
    @SerialName("info")
    val info: Info = Info(),
    @SerialName("results")
    val results: List<Results>
)

