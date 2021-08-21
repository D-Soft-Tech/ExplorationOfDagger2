package com.example.dagger2

import dagger.Module
import dagger.Provides

@Module
class SeatModule {
    @Provides
    fun providesSeat(): Seat = Seat()
}
