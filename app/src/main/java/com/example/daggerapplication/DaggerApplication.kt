package com.example.daggerapplication

import android.app.Application
import com.example.daggerapplication.di.AppComponent
import com.example.daggerapplication.di.DaggerAppComponent
import com.example.daggerapplication.di.DriverModule

class DaggerApplication: Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.factory().create(DriverModule("Jitendra Yadav"))
    }

    fun getAppComponent(): AppComponent {
        return appComponent
    }
}