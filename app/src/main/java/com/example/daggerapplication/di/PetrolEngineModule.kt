package com.example.daggerapplication.di

import com.example.daggerapplication.car.Engine
import com.example.daggerapplication.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {
    @Binds
    abstract fun bindPetrolEngine(petrolEngine: PetrolEngine) : Engine
}