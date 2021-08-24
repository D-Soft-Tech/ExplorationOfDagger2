package com.example.dagger2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerComponent.builder()
            .provideCushionFoamThickness(225)
            .providePowerCapacity(1000)
            .provideTypeOfCoverings("Leather")
            .buildTheComponent()
        carComponent.injectCarIntoMainActivity(this)
        car.startCar()
        car.seat.cushion.getCushionThicknessRemark()
    }
}
