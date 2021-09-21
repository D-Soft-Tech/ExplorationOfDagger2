package com.example.dagger2

import android.os.Bundle
import javax.inject.Inject
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = (application as DaggerComponentApplication).getApplicationLevelDaggerComponent()
        carComponent.injectCarIntoMainActivity(this)
        car.startCar()
        car.seat.cushion.getCushionThicknessRemark()
    }
}
