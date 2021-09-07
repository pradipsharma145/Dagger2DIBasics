package com.dhruhesh.dagger2dibasics

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor() {

    private val TAG = "Engine"

    fun helloEngine(i: Int) {
        if (i == 1 ) {
            Log.e(TAG, "helloEngine($i) Method Injection Example...")

        } else {
            Log.e(TAG, "helloEngine($i) Construction Injection Example...")
        }
    }
}