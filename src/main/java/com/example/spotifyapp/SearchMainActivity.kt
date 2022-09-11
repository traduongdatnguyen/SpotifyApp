package com.example.spotifyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.toColor
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_search_main.*

class SearchMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_main)
        getBottomNaviga()
    }


    private fun getBottomNaviga(){
        bottom_navigation.setOnNavigationItemReselectedListener{ item->
            when(item.itemId){
                R.id.page_1 -> {
                    startActivity(Intent(this,MainActivity::class.java))
//                    setVrModeEnabled(false,componentName)
                }
                R.id.page_2 -> {
                    startActivity(Intent(this,SearchMainActivity::class.java))
                }
                R.id.page_3 -> {
                    startActivity(Intent(this,LibrarianMainActivity::class.java))
                }
                 else ->  startActivity(Intent(this,SearchMainActivity::class.java))
            }
        }
    }
}