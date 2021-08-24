package com.example.dagger2

import dagger.Module
import dagger.Provides

@Module
class SeatModule {
//    var cushionFoamThickness: Int
//    var typeOfCoverings: String
//
//    constructor(cushionFoamThickness: Int, typeOfCoverings: String) {
//        this.cushionFoamThickness = cushionFoamThickness
//        this.typeOfCoverings = typeOfCoverings
//    }

//    @Provides
//    fun providesCushion(cushionFoamThickness: Int) = Cushion(cushionFoamThickness)
//
//    @Provides
//    fun providesCoverings(typeOfCoverings: String) = Coverings(typeOfCoverings)

    @Provides
    fun providesSeat(cushion: Cushion, coverings: Coverings): Seat =
        Seat(cushion, coverings)
}
