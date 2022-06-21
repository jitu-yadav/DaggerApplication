package com.example.daggerapplication.di

import com.example.daggerapplication.car.DieselEngine
import com.example.daggerapplication.car.Engine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(var horsePower:Int) {

    @Provides
    fun provideHorsePower(): Int {
        return horsePower
    }

    @Provides
    fun provideDieselEngine(dieselEngine: DieselEngine) : Engine {
        return dieselEngine
    }
}