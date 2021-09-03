package com.dhruhesh.dagger2dibasics

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor() {

    companion object {
        private const val TAG = "Engine"
    }

    fun getEngineFun() {
        Log.e(Companion.TAG, "getEngineFun()...")
    }
}