package com.example.todoapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Adapter:RecyclerView.Adapter<Adapter.viewHolder>() {
    class viewHolder(itemView:View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        var itemView=LayoutInflater.from(parent.context).
                inflate(R.layout.view,parent,false)

        return viewHolder(itemView)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        TODO("Not yet implemented")
        //learn more about it in secomd section
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}