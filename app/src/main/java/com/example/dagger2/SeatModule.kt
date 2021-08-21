package com.example.dagger2

import dagger.Module
import dagger.Provides

@Module
class SeatModule {
    @Provides
    fun providesCushion() = Cushion()

    @Provides
    fun providesCoverings() = Coverings()

    @Provides
    fun providesSeat(cushion: Cushion, coverings: Coverings): Seat =
        Seat(cushion, coverings)
}
