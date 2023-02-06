package com.learn.demoapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView

class MainActivity3 : AppCompatActivity() {

    val msg = "Track :"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        Log.d(msg, "Oncreate event occured")

        val flowerList = Datasource(this).getFlowerList()
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = FlowerAdapter(flowerList)
    }
}