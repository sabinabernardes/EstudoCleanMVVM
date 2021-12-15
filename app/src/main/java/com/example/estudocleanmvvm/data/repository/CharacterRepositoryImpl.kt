package com.example.estudocleanmvvm.data.repository

import com.example.estudocleanmvvm.data.datasource.CharacterDataSource
import com.example.estudocleanmvvm.data.models.CharacterResponse
import com.example.estudocleanmvvm.domain.repository.CharacterRepository
import io.reactivex.Single

internal class CharacterRepositoryImpl(
    private val characterDataSource: CharacterDataSource
): CharacterRepository {

    override fun getCharacter(): Single<CharacterResponse> {
        return characterDataSource.getCharacter()
    }
}


