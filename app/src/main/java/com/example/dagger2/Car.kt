package com.example.dagger2

import javax.inject.Inject

class Car @Inject constructor(var wheel: Wheel, var engine: Engine) {

    fun startCar() {
        engine.start()
        println("Car has been started so we are driving the car.............")
    }
}
