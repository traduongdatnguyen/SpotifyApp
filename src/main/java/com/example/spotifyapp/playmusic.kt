package com.example.spotifyapp

import android.media.MediaParser
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_playmusic.*

class playmusic : AppCompatActivity() {
    val dataPlayMusics = arrayListOf(R.raw.music,R.raw.anhtheday)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playmusic)
        val mediaPlayer: MediaPlayer = MediaPlayer.create(this,dataPlayMusics[0])
        nextBackMusic(mediaPlayer)

        seekbar.progress = 0
        seekbar.max = mediaPlayer.duration
        playMusic.setOnClickListener{
            if (!mediaPlayer.isPlaying){
                mediaPlayer.start()
                playMusic.setImageResource(R.drawable.play)
            }else{
                mediaPlayer.pause()
                playMusic.setImageResource(R.drawable.pausemusi)
            }
        }
        seekbar.setOnSeekBarChangeListener (object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                if (fromUser){
                    mediaPlayer.seekTo(progress)
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

    }
    fun nextBackMusic(mediaPlayer: MediaPlayer){
        if (mediaPlayer.isPlaying){
            nextMusic.setOnClickListener{
                mediaPlayer.stop()
                val mediaPlayer1 = MediaPlayer.create(this,dataPlayMusics[1])
                mediaPlayer1.start()
            }
            backMusic.setOnClickListener{
                mediaPlayer.stop()
                val mediaPlayer2 = MediaPlayer.create(this,dataPlayMusics[0])
                mediaPlayer2.start()
            }
        }


    }
}