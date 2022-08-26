package com.example.spotifyapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LibrarianAdapter(val dataLibrarians: ArrayList<DataLibrarians>):RecyclerView.Adapter<LibrarianAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewHolder = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_librarian,parent,false)
        return ViewHolder(viewHolder)
    }

    override fun onBindViewHolder(holder: LibrarianAdapter.ViewHolder, position: Int) {
        holder.onBind(dataLibrarians[position])
    }

    override fun getItemCount(): Int {
        return  dataLibrarians.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imageView:ImageView = itemView.findViewById(R.id.imageLibrarian)
        val nameLibrarians:TextView = itemView.findViewById(R.id.nameLibrarian)

        fun onBind(data: DataLibrarians){
            nameLibrarians.text = data.nameLibrarian
        }
    }
}