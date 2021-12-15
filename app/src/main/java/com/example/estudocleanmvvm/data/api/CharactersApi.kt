package com.example.estudocleanmvvm.data.api

import com.example.estudocleanmvvm.data.models.CharacterResponse
import io.reactivex.Single
import retrofit2.http.GET

interface CharactersApi {

    @GET("character")
    fun getCharacters(): Single<CharacterResponse>
}