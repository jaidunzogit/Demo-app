package com.learn.demoapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log



class MainActivity : AppCompatActivity() {

    val msg:String = "MAIN ACTIVITY :"

    override fun onStart() {
        super.onStart()
        Log.d(msg,"The onStart() event")
    }

    override fun onResume() {
        super.onResume()
        Log.d(msg,"The onResume() event")

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(msg,"The onCreate() event")
        val intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }

    override fun onPause() {
        super.onPause()
        Log.d(msg,"The onPause() Event")
    }

    override fun onStop() {
        super.onStop()
        Log.d(msg,"The onStop() event")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(msg, "The onDestroy() Event")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(msg, "The onRestart() Called")
    }

}