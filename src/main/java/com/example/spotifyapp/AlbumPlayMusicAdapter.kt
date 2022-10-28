package com.example.spotifyapp

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlin.collections.ArrayList

class AlbumPlayMusicAdapter(val listMusics: ArrayList<Music>): RecyclerView.Adapter<AlbumPlayMusicAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumPlayMusicAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_album_playmusic,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlbumPlayMusicAdapter.ViewHolder, position: Int) {
        holder.onBind(listMusics[position])
    }

    override fun getItemCount(): Int {
        return listMusics.size
    }

    class ViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
            val nameMusic: TextView = itemView.findViewById(R.id.nameMusic)
            val imageMusic: ImageView = itemView.findViewById(R.id.imageMusic)
            val authorName: TextView = itemView.findViewById(R.id.authorName)

        fun onBind(music : Music){
            nameMusic.text = music.nameMusic
            authorName.text = music.author
        }
    }

}