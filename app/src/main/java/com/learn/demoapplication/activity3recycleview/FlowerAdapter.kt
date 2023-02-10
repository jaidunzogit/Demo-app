package com.learn.demoapplication.activity3recycleview

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.learn.demoapplication.R

class FlowerAdapter(val flowerList:Array<String>) : RecyclerView.Adapter<FlowerAdapter.FlowerViewHolder>() {

    val msg = "Track :"

    class FlowerViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        private val flowerTextView:TextView = itemView.findViewById(R.id.flower_text)
        val msg = "Track :"
        fun bind(word:String){
            Log.d(msg,"Bind function is called")
            flowerTextView.text = word
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowerViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.flower_item,parent,false)
        Log.d(msg,"oncreateViewHolder")
        return FlowerViewHolder(view)
    }

    override fun getItemCount(): Int {
        Log.d(msg,"getitemcount called")
        return flowerList.size
    }

    override fun onBindViewHolder(holder: FlowerViewHolder, position: Int) {

        Log.d(msg,"Bind View Holder Called")
        holder.bind(flowerList[position])
    }

}