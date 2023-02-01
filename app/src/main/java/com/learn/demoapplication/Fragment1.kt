package com.learn.demoapplication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Fragment1: Fragment() {


    val msg = "Fragment1 :"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(msg,"The fragment1 oncreate() event")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fragment1,container,false)
        Log.d(msg,"The fragment1 onCreayeView() event")
    }

    override fun onStart() {
        super.onStart()
        Log.d(msg,"The fragment1 onStart() event")
    }

    override fun onResume() {
        super.onResume()
        Log.d(msg,"The fragment1 onResume() event")
    }

    override fun onPause() {
        super.onPause()
        Log.d(msg,"The fragment1 onPause() event")
    }

    override fun onStop() {
        super.onStop()
        Log.d(msg,"The fragment1 onStop() event")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(msg,"The fragment1 onDestroy() event")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(msg,"The fragment1 onDestroyView() event")
    }

}