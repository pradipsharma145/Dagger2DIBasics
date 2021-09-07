package com.dhruhesh.dagger2dibasics

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {

    private val TAG = "Remote"

    fun setListeners(car: Car) {
        Log.d(TAG, "setListeners()...")
    }
}