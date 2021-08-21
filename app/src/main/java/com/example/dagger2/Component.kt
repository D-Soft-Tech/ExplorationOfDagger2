package com.example.dagger2

import dagger.Component

@Component(modules = [DieselEngineModule::class, SeatModule::class])
interface Component {
    fun getCar(): Car

    fun injectCarIntoMainActivity(mainActivity: MainActivity)
}
