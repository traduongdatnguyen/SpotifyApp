package com.example.spotifyapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SimpleAdapter(val itemTitle: ArrayList<String>, val itemImage: ArrayList<Int>  ): RecyclerView.Adapter<SimpleAdapter.ViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleAdapter.ViewHolder {
       val v = LayoutInflater.from(parent.context).inflate(R.layout.view_holer_cateloryhome,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: SimpleAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = itemTitle[position]
        holder.itemImage.setImageResource(itemImage[position])
    }

    override fun getItemCount(): Int {
        return itemImage.size
    }

    inner class ViewHolder(itemView : View):RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle : TextView

        init {
            itemImage = itemView.findViewById(R.id.itemImage)
            itemTitle = itemView.findViewById(R.id.itemTitle)
        }
    }

}