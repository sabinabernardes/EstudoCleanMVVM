package com.example.estudocleanmvvm.data.datasource

import com.example.estudocleanmvvm.data.models.CharacterResponse
import com.example.estudocleanmvvm.data.service.RetrofitService
import io.reactivex.Single

internal class CharactersDataSourceImpl: CharacterDataSource {

    override fun getCharacter(): Single<CharacterResponse> {
        return RetrofitService.service.getCharacters()
    }
}