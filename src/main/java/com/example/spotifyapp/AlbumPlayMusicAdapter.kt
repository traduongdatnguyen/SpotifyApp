package com.example.spotifyapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlin.collections.ArrayList

class AlbumPlayMusicAdapter(val listMusic: ArrayList<Music> ):RecyclerView.Adapter<AlbumPlayMusicAdapter.ViewHolder>() {

    private val dataListMusic = listMusic

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumPlayMusicAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_album_playmusic,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: AlbumPlayMusicAdapter.ViewHolder, position: Int) {
        holder.nameMusic.text = "Yêu"
       holder.authorMusic.text = "Hello"
    }


    override fun getItemCount(): Int {
        return dataListMusic.size
    }
    //TÌM HIỂU INNER CLASS
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val nameMusic: TextView
        val imageMusic: ImageView
        val authorMusic: TextView

        init {
            nameMusic = itemView.findViewById(R.id.nameMusic)
            imageMusic = itemView.findViewById(R.id.imageMusic)
            authorMusic = itemView.findViewById(R.id.authorName)
        }
    }


}