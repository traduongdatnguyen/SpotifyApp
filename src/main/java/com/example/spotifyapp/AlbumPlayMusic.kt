package com.example.spotifyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_album_play_music.*
import kotlinx.android.synthetic.main.activity_main.*

class AlbumPlayMusic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_album_play_music)

        getDataAlbumPlayMusic()


    }
    //get data
    fun getDataAlbumPlayMusic(){
        val dataMusic : ArrayList<Music> = arrayListOf(Music("Yêu","image2.png","Hello"),Music("Yêu2","image2.png","Hi"),Music("Yêu3","image2.png","Hi"),Music("Yêu5","image2.png","Hello"))

        var adapter: RecyclerView.Adapter<AlbumPlayMusicAdapter.ViewHolder>? = null
        var layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        adapter = AlbumPlayMusicAdapter(dataMusic)
        albumviewphlaymusic.layoutManager = layoutManager
        albumviewphlaymusic.adapter = adapter

    }
    fun actionIntent(view: View){
        startActivity(Intent(this,playmusic::class.java))
    }
}