package com.example.spotifyapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LibrarianAdapter(val dataLibrarians: ArrayList<DataLibrarians>): RecyclerView.Adapter<LibrarianAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LibrarianAdapter.ViewHolder {
        val parent = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_librarian,parent,false)
        return ViewHolder(parent)
    }

    override fun onBindViewHolder(holder: LibrarianAdapter.ViewHolder, position: Int) {
        holder.onBind(dataLibrarians[position])
    }

    override fun getItemCount(): Int {
        return dataLibrarians.size
    }
    inner class ViewHolder(view: View) :RecyclerView.ViewHolder(view) {
        val textLibrarians :TextView = view.findViewById(R.id.nameLibrarian)
        val imageLibrarian:ImageView = view.findViewById(R.id.imageLibrarian)
        fun onBind(dataLibrarians: DataLibrarians){
            textLibrarians.text = dataLibrarians.nameLibrarian

        }
    }
}

