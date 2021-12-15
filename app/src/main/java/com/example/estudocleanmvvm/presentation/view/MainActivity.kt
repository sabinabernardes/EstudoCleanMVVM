package com.example.estudocleanmvvm.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.estudocleanmvvm.R
import com.example.estudocleanmvvm.databinding.ActivityMainBinding
import com.example.estudocleanmvvm.presentation.viewModel.CharactersViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: CharactersViewModel by viewModel()

    private val list = mutableListOf<CharacterItemResult>()
    private val adapter = CharactersAdapter(list)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //viewModel = ViewModelProvider(this).get(CharactersViewModel::class.java)

        binding.rvMain.adapter = adapter
        binding.rvMain.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        viewModel.getCharacters()

        viewModel.charactersResult.observe(this, Observer{
            adapter.updateList(it.results as MutableList<CharacterItemResult>)
        })
    }
}