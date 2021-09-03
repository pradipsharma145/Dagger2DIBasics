package com.dhruhesh.dagger2dibasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    lateinit var mCar: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mCarComponent = DaggerCarComponent.create()
        //  mCarComponent.inject(this)

        mCar = mCarComponent.car!!
        mCar.drive()
    }
}