package com.dhruhesh.dagger2dibasics

import android.util.Log
import javax.inject.Inject

class Wheels @Inject constructor() {

    private val TAG = "Wheels"

    fun helloWheels() {
        Log.e(TAG, "helloWheels()...")
    }
}