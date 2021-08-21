package com.example.dagger2

import dagger.Component

@Component
interface Component {
    fun getCar(): Car

    fun injectCarIntoMainActivity(mainActivity: MainActivity)
}
