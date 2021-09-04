package com.dhruhesh.dagger2dibasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    private lateinit var mCar: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarComponent.create()

        mCar = carComponent.car
        mCar.drive()
    }
}