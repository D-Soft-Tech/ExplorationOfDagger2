package com.example.dagger2

import dagger.Module
import dagger.Provides

@Module
class SeatModule {
    private val cushionFoamThickness = 100
    @Provides
    fun providesCushion() = Cushion(cushionFoamThickness)

    @Provides
    fun providesCoverings() = Coverings()

    @Provides
    fun providesSeat(cushion: Cushion, coverings: Coverings): Seat =
        Seat(cushion, coverings)
}
