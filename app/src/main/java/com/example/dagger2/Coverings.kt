package com.example.dagger2

class Coverings {

    private var typeOfCoverings: String
    constructor(typeOfCoverings: String) {
        this.typeOfCoverings = typeOfCoverings
        println("Coverings created, the coverings is of type: $typeOfCoverings")
    }
}
