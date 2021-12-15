package com.example.estudocleanmvvm.domain.usecase

import com.example.charactersrickandmorty.domain.model.Characters
import com.example.estudocleanmvvm.domain.repository.CharacterRepository
import io.reactivex.Single

class CharactersUseCase(
    private val repository: CharacterRepository,
    //private val characterMapper: CharacterMapper
) {

    operator fun invoke(): Single<Characters> {
        return repository.getCharacter().map(characterMapper)
    }
}
