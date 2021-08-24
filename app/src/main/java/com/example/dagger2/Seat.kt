package com.example.dagger2

class Seat {
    var cushion: Cushion
    var coverings: Coverings

    constructor(cushion: Cushion, coverings: Coverings) {
        this.cushion = cushion
        this.coverings = coverings
    }

    fun getSetSpecifications() {
        println(
            "The seat specifications are as follow: \n" +
                "20cm thick couching \n" +
                "Leather coverings"
        )
    }
}
