package com.example.dagger2

import dagger.Module
import dagger.Provides

@Module
class SeatModule {
    private var cushionFoamThickness: Int
    private var typeOfCoverings: String

    constructor(cushionFoamThickness: Int, typeOfCoverings: String) {
        this.cushionFoamThickness = cushionFoamThickness
        this.typeOfCoverings = typeOfCoverings
    }
    @Provides
    fun providesCushion() = Cushion(cushionFoamThickness)

    @Provides
    fun providesCoverings() = Coverings(typeOfCoverings)

    @Provides
    fun providesSeat(cushion: Cushion, coverings: Coverings): Seat =
        Seat(cushion, coverings)
}
