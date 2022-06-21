package com.example.daggerapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerapplication.car.Car
import com.example.daggerapplication.di.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var car1: Car
    @Inject lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activityComponent = (application as DaggerApplication).getAppComponent().getActivityComponentFactory()
            .create(170, 1800)
        activityComponent.inject(this)
        car1.drive()
        car2.drive()
    }
}