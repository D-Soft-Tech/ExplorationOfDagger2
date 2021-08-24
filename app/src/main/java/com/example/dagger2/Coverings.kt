package com.example.dagger2

import javax.inject.Inject

class Coverings {
    var typeOfCoverings: String
    @Inject
    constructor(typeOfCoverings: String) {
        this.typeOfCoverings = typeOfCoverings
        println("Coverings created, the coverings is of type: $typeOfCoverings")
    }
}
