package com.example.spotifyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_album_play_music.*
import kotlinx.android.synthetic.main.activity_main.*

class AlbumPlayMusic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_album_play_music)
       val dataMusic : ArrayList<Music> = arrayListOf(Music("Yêu","image2.png","Hello"),Music("Yêu5","image2.png","Hello"))

        var adapter: RecyclerView.Adapter<AlbumPlayMusicAdapter.ViewHolder>? = null
        var layoutManager: RecyclerView.LayoutManager? = null
        adapter = AlbumPlayMusicAdapter(dataMusic)
        layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        albumviewphlaymusic.layoutManager = layoutManager
        albumviewphlaymusic.adapter = adapter
    }
}