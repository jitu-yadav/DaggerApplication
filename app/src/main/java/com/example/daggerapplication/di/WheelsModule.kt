package com.example.daggerapplication.di

import com.example.daggerapplication.car.Rims
import com.example.daggerapplication.car.Tires
import com.example.daggerapplication.car.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun provideRims() : Rims {
        return Rims()
    }

    @Provides
    fun provideTires(): Tires {
        val tires = Tires()
        tires.inflate()
        return tires
    }

    @Provides
    fun provideWheels(rims: Rims, tires: Tires): Wheels {
        return Wheels(rims, tires)
    }

}