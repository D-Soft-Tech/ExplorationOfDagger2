package com.example.dagger2

import android.app.Application

class DaggerComponentApplication : Application() {

    lateinit var carComponent: Component

    override fun onCreate() {
        super.onCreate()
        carComponent = DaggerComponent.builder()
            .provideCushionFoamThickness(225)
            .providePowerCapacity(1000)
            .provideTypeOfCoverings("Leather")
            .buildTheComponent()
    }

    fun getApplicationLevelDaggerComponent() = carComponent
}