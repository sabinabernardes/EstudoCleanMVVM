package com.example.charactersrickandmorty.domain.model


data class Characters(
    val info: Info = Info(),
    val results: List<CharactersResult>
)

