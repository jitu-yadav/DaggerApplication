package com.example.daggerapplication.di

import com.example.daggerapplication.car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DriverModule (var driverName: String) {

    @Provides
    @Singleton
    fun provideDriver():Driver {
        return Driver(driverName)
    }
}