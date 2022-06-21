package com.example.daggerapplication.car

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(@Named("horsePower") private var horsePower: Int,
                                       @Named("engineCapacity") private var engineCapacity: Int) : Engine {

    companion object {
        const val TAG = "Car"
    }

    override fun startEngine() {
        Log.d(TAG, "Petrol Engine started. \n HorsePower: $horsePower \nEngineCapacity: $engineCapacity")
    }
}