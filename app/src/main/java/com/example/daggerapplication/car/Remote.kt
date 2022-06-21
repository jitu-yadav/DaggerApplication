package com.example.daggerapplication.car

import android.util.Log
import javax.inject.Inject

class Remote {
    @Inject
    constructor()

    companion object {
        const val TAG = "Car"
    }

    fun setListener(car: Car) {
        Log.d(TAG, "Remote connected")
    }

}