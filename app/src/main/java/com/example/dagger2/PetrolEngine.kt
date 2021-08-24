package com.example.dagger2

import javax.inject.Inject
import javax.inject.Named

class PetrolEngine : Engine {
    var powerCapacity: Int

    @Inject
    constructor(@Named("power")powerCapacity: Int) {
        this.powerCapacity = powerCapacity
    }

    override fun start() {
        println("Petrol Engine started")
    }
}
