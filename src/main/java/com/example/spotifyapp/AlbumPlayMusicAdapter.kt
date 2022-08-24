package com.example.spotifyapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlin.collections.ArrayList

class AlbumPlayMusicAdapter(val listMusic: ArrayList<Music> ):RecyclerView.Adapter<AlbumPlayMusicAdapter.ViewHolder>() {

    private val dataListMusic = listMusic

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumPlayMusicAdapter.ViewHolder {
        return ViewHolder(parent)
    }

    override fun onBindViewHolder(holder: AlbumPlayMusicAdapter.ViewHolder, position: Int) {
        (holder as ViewHolder).OnBind(dataListMusic[position])
    }


    override fun getItemCount(): Int {
        return listMusic.size
    }
    //TÌM HIỂU INNER CLASS
    inner class ViewHolder(itemView:ViewGroup): RecyclerView.ViewHolder(LayoutInflater.from(itemView.context).inflate(R.layout.activity_album_play_music,itemView,false)){

        val nameMusic: TextView = itemView.findViewById(R.id.nameMusic)
        val imageMusic:TextView = itemView.findViewById(R.id.imageMusic)
        val authorMusic: TextView = itemView.findViewById(R.id.authorName)

        fun OnBind(music: Music) {
            nameMusic.text = music.nameMusic.toString() +""
            authorMusic.text = music.author.toString() +""
        }
    }


}