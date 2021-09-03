package com.dhruhesh.dagger2dibasics

import android.util.Log
import javax.inject.Inject

class Wheels @Inject constructor() {

    companion object {
        private const val TAG = "Wheels"
    }

    fun getWheelsFun() {
        Log.e(TAG, "getWheelsFun()...")
    }
}