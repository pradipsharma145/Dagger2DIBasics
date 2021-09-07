package com.dhruhesh.dagger2dibasics

import android.util.Log
import javax.inject.Inject

class Wheels @Inject constructor(rims: Rims, tires: Tires) {

    private val TAG = "Wheels"

    fun helloWheels() {
        Log.e(TAG, "helloWheels()...")
    }
}