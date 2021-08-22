package com.example.dagger2

class Cushion {
    val cushionFoamThickness: Int

    constructor(cushionFoamThickness: Int) {
        this.cushionFoamThickness = cushionFoamThickness
        println("Cushion Created, thickness = $cushionFoamThickness")
    }
}
