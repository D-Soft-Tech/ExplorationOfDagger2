package com.example.dagger2

import javax.inject.Inject

class Petrol @Inject constructor() {

    @Inject
    fun providesPetrolToCarDriveFunction(car: Car) {
        car.drive(this)
    }
}
