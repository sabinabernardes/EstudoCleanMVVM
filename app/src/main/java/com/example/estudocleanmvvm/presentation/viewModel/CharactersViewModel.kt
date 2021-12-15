package com.example.estudocleanmvvm.presentation.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.charactersrickandmorty.domain.model.Characters
import com.example.estudocleanmvvm.domain.usecase.CharactersUseCase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

internal class CharactersViewModel(
    private val charactersUseCase: CharactersUseCase
) : ViewModel() {
    val charactersResult: MutableLiveData<Characters> = MutableLiveData()
    private val error: MutableLiveData<String> = MutableLiveData()

    fun getCharacters(){
            charactersUseCase()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    charactersResult.value = it
                },{ e ->
                    error.value = e.message
                })
    }

}