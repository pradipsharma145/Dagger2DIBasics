package com.dhruhesh.dagger2dibasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    //  private lateinit var mCar: Car  //  DO, Construction Injection declaration

    @Inject
    lateinit var mCar: Car  //  DO, Field Injection declaration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarComponent.create()
        carComponent.inject(this)   //  DO, for Field Injection

        //  mCar = carComponent.car //  DO, for constructor Injection
        mCar.drive()
    }
}