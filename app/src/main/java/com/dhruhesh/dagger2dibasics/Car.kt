package com.dhruhesh.dagger2dibasics

import android.util.Log
import javax.inject.Inject

//  class Car @Inject constructor(private var engine: Engine, private var wheels: Wheels) {
class Car @Inject constructor(private var engine: Engine, private var wheels: Wheels) {

    private val TAG = "Car"

    /***
     * DO, Method Injection...
     * */

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListeners(this)
    }

    @Inject
    fun helloEngineFun(engine: Engine) {
        engine.helloEngine(1)
    }

    /***
     * END, Method Injection...
     * */

    fun drive() {
        Log.d(TAG, "drive()...")

        engine.helloEngine(2)
        wheels.helloWheels()
    }
}