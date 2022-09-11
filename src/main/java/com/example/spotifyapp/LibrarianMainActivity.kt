package com.example.spotifyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_librarian_main.*
import kotlinx.android.synthetic.main.activity_search_main.*

class LibrarianMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_librarian_main)
        getBottomNaviga()


        val dataLibrarians : ArrayList<DataLibrarians> = arrayListOf(DataLibrarians("image2.png","Hello"))

        var adapter: RecyclerView.Adapter<LibrarianAdapter.ViewHolder>? = null
        var layoutManager: RecyclerView.LayoutManager? = null
        adapter = LibrarianAdapter(dataLibrarians)
        layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        recyclerViewLibrarian.layoutManager = layoutManager
        recyclerViewLibrarian.adapter = adapter
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