package com.example.dagger2

import javax.inject.Inject

class PetrolEngine @Inject constructor() : Engine {

    override fun start() {
        println("Petrol Engine started")
    }
}
