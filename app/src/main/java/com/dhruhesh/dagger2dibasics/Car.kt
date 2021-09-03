package com.dhruhesh.dagger2dibasics

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(engineParam: Engine, wheelsParam: Wheels) {

    companion object {
        private const val TAG = "Car"
    }

    private var engine: Engine = engineParam
    private var wheels: Wheels = wheelsParam

    fun drive() {
        Log.d(TAG, "drive()...")

        engine.getEngineFun()
        wheels.getWheelsFun()
    }
}