package com.example.estudocleanmvvm.di

import com.example.estudocleanmvvm.data.api.CharactersApi
import com.example.estudocleanmvvm.data.datasource.CharacterDataSource
import com.example.estudocleanmvvm.data.datasource.CharactersDataSourceImpl
import com.example.estudocleanmvvm.data.repository.CharacterRepositoryImpl
import com.example.estudocleanmvvm.domain.repository.CharacterRepository
import com.example.estudocleanmvvm.domain.usecase.CharactersUseCase
import com.example.estudocleanmvvm.presentation.viewModel.CharactersViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

internal class CharactersModule : FeatureModule() {
 override val dataModule = module {
  factory { get<HttpClient>().create(service = CharactersApi::class.java) }
  factory<CharacterDataSource> { CharactersDataSourceImpl() }
  factory<CharacterRepository> { CharacterRepositoryImpl(characterDataSource = get()) }
 }

 override val domainModule = module {
  factory { CharactersUseCase(repository = get()) }
 }

 override val presentationModule =
  module { viewModel { CharactersViewModel(charactersUseCase = get()) } }
}



