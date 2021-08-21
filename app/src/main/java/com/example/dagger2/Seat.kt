package com.example.dagger2

class Seat(private var cushion: Cushion, private var coverings: Coverings) {

    fun getSetSpecifications() {
        println(
            "The seat specifications are as follow: \n" +
                "20cm thick couching \n" +
                "Leather coverings"
        )
    }
}
