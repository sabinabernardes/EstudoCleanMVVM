package com.example.estudocleanmvvm.di

import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

abstract class FeatureModule {

    protected open val presentationModule: Module = module {}

    protected open val domainModule: Module = module {}

    protected open val dataModule: Module = module {}

    protected open val additionalModules: List<Module> = emptyList()

    fun load() {
        val defaultModules = listOf(
            presentationModule,
            domainModule,
            dataModule
        )
        loadKoinModules(defaultModules + additionalModules)
    }
}