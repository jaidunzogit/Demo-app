package com.learn.demoapplication

import android.content.Context
import android.util.Log

class Datasource (val context:Context){
    val msg = "Track :"
    fun getFlowerList():Array<String>{
        Log.d(msg,"Returned from Datasource")
        return context.resources.getStringArray(R.array.flower_array)
    }
}