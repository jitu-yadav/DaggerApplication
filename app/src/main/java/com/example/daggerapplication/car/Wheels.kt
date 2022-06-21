package com.example.daggerapplication.car

import android.util.Log

class Wheels {

    companion object {
        const val TAG = "Car"
    }
    private lateinit var rims: Rims
    private lateinit var tires: Tires

    constructor(rims: Rims, tires: Tires) {
        this.rims = rims
        this.tires = tires
    }

    fun wheelsType() {
        Log.d(TAG, "Alloy wheels...")
    }
}