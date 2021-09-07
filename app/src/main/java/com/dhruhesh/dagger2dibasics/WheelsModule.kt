package com.dhruhesh.dagger2dibasics

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
object WheelsModule {

    private const val TAG = "WheelsModule"

    @Provides
    fun provideRims(): Rims {
        val rims = Rims()
        rims.helloRims()
        return rims
    }

    @Provides
    fun provideTires(): Tires {
        val tires = Tires()
        tires.helloTires()
        return tires
    }

    @Provides
    fun provideWheels(rims: Rims, tires: Tires): Wheels {
        Log.d(TAG, "provideWheels() learn Module...")
        return Wheels(rims, tires)
    }
}