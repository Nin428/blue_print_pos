package com.ayeee.blue_print_pos

import android.util.Log

object Logger {
    private const val isDebug = false 

    fun log(message: String) {
        if (isDebug) {
            Log.d("BluePrintPos", message)
        }
    }
}