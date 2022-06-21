package com.example.daggerapplication.car

import android.util.Log

class Tires {
    companion object {
        const val TAG = "Car"
    }

    fun inflate() {
        Log.d(TAG, "Tires inflated")
    }
}