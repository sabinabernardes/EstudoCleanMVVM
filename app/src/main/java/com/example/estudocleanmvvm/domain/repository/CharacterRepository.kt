package com.example.estudocleanmvvm.domain.repository

import com.example.estudocleanmvvm.data.models.CharacterResponse
import io.reactivex.Single

 interface CharacterRepository {
    fun getCharacter(): Single<CharacterResponse>
}