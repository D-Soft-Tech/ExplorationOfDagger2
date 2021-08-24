package com.example.dagger2

import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component(modules = [SeatModule::class, PetrolEngineModule::class])
interface Component {

    fun injectCarIntoMainActivity(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun providePowerCapacity(@Named("power")powerCapacity: Int): Builder

        @BindsInstance
        fun provideCushionFoamThickness(@Named("foamThickness")cushionFoamThickness: Int): Builder

        @BindsInstance
        fun provideTypeOfCoverings(typeOfCoverings: String): Builder

        fun buildTheComponent(): com.example.dagger2.Component
    }
}
