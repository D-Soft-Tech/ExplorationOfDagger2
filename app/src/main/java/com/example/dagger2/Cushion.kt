package com.example.dagger2

import javax.inject.Inject
import javax.inject.Named

class Cushion {
    var cushionFoamThickness: Int

    @Inject
    constructor(@Named("foamThickness")cushionFoamThickness: Int) {
        this.cushionFoamThickness = cushionFoamThickness

        println("Cushion Created, thickness = $cushionFoamThickness")
    }

    fun getCushionThicknessRemark() {
        when (cushionFoamThickness) {
            in 100..200 -> {
                println("Good Thickness")
            }
            in 201..300 -> {
                println("Better Thickness")
            }
            in 301..400 -> {
                println("Most Preferred Thickness")
            }
        }
    }
}
