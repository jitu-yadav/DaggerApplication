package com.example.daggerapplication.car

import android.util.Log
import com.example.daggerapplication.di.PreActivity
import javax.inject.Inject

@PreActivity
class Car @Inject constructor(
    var driver: Driver,
    var engine: Engine,
    var wheels: Wheels
) {

    companion object {
        const val TAG = "Car"
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        engine.startEngine()
        Log.d(TAG, "$driver ${driver.name} driving $this")
    }
}