package com.kamel.recyclerviewexercise

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(itemView : View, data : MyData, adapterClickable: AdapterClickable) : RecyclerView.ViewHolder(itemView) {

    val name : TextView = itemView.findViewById(R.id.tvName)

    init {
        name.setOnClickListener {
            adapterClickable.onClickListener(adapterPosition)
        }
    }
}