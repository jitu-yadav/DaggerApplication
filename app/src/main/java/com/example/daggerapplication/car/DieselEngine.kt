package com.example.daggerapplication.car

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(var horsePower: Int) : Engine {

    companion object {
        const val TAG = "Car"
    }

    override fun startEngine() {
        Log.d(TAG, "Diesel Engine started. HorsePower: $horsePower")
    }
}