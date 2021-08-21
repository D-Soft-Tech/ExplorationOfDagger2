package com.example.dagger2

import javax.inject.Inject

class Car @Inject constructor(var wheel: Wheel, var engine: Engine, var seat: Seat) {

    fun startCar() {
        engine.start()
        seat.getSetSpecifications()
        println("Car has been started so we are driving the car.............")
    }
}
