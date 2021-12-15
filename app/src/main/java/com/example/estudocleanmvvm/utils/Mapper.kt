package com.example.estudocleanmvvm.utils

interface Mapper<S, T> {
    fun map(source: S): T
}