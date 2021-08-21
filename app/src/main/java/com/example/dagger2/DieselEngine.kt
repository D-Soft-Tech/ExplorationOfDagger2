package com.example.dagger2

import javax.inject.Inject

class DieselEngine @Inject constructor() : Engine {
    override fun start() {
        println("Diesel Engine started")
    }
}
