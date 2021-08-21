package com.example.dagger2

import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun providesDieselEngine(dieselEngine: DieselEngine): Engine
}
