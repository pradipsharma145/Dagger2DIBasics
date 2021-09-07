package com.dhruhesh.dagger2dibasics

import dagger.Component

@Component (modules = [WheelsModule::class])
interface CarComponent {

    fun inject(mainActivity: MainActivity)

    val car: Car
}