package com.learn.demoapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity2 : AppCompatActivity() {

    val msg:String = "MAIN Activity 2 :"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.d(msg,"The onCreate() event2")
    }
}