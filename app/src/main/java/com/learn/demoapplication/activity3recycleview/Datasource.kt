package com.learn.demoapplication.activity3recycleview

import android.content.Context
import android.util.Log
import com.learn.demoapplication.R

class Datasource (val context:Context){
    val msg = "Track :"
    fun getFlowerList():Array<String>{
        Log.d(msg,"Returned from Datasource")
        return context.resources.getStringArray(R.array.flower_array)
    }
}