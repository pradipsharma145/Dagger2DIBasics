package com.dhruhesh.dagger2dibasics

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(private var engine: Engine, private var wheels: Wheels) {

    private val TAG = "Car"

    fun drive() {
        Log.d(TAG, "drive()...")
    }
}