package com.example.estudocleanmvvm.data.datasource

import com.example.estudocleanmvvm.data.models.CharacterResponse
import io.reactivex.Single

internal interface CharacterDataSource {
    fun getCharacter() : Single<CharacterResponse>
}