package com.dhruhesh.dagger2dibasics

import dagger.Component

@Component
interface CarComponent {

    /*fun inject(mainActivity: MainActivity) {

    }*/

    val car: Car?
}