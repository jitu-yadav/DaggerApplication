package com.example.daggerapplication.di

import com.example.daggerapplication.MainActivity
import com.example.daggerapplication.car.Car
import com.example.daggerapplication.car.Wheels
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

@PreActivity
@Subcomponent(modules = [WheelsModule::class, PetrolEngineModule::class])
interface ActivityComponent {
    fun getCar() : Car

    fun getWheels() : Wheels

    fun inject(activity: MainActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create(@BindsInstance @Named("horsePower") horsePower:Int,
                   @BindsInstance @Named("engineCapacity")engineCapacity:Int): ActivityComponent
    }
}