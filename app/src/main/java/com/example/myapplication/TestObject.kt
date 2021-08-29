package com.example.myapplication

import android.util.Log

object TestObject {
    val TAG = "tag"
    fun somethingNoStep(max: Int) {
        for (i in 0..max) {
            Log.i(TAG, " это $i")
        }
    }

}