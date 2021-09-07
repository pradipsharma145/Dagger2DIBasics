package com.dhruhesh.dagger2dibasics

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor() {

    private val TAG = "Engine"

    fun helloEngine() {
        Log.e(TAG, "helloEngine()...")
    }
}