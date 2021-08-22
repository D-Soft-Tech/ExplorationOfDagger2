package com.example.dagger2

import javax.inject.Inject

class Car @Inject constructor(var wheel: Wheel, var engine: Engine, var seat: Seat) {

    fun startCar() {
        engine.start()
        seat.getSetSpecifications()
        println("Car started.............")
    }

    fun drive(petrol: Petrol) {
        println("petrol is supplied, hence we are able to drive the car.............")
    }
}
