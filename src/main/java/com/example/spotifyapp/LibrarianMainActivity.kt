package com.example.spotifyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_librarian_main.*

class LibrarianMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_librarian_main)

        val dataLibrarians : ArrayList<DataLibrarians> = arrayListOf(DataLibrarians("image2.png","Hello"))

        var adapter: RecyclerView.Adapter<LibrarianAdapter.ViewHolder>? = null
        var layoutManager: RecyclerView.LayoutManager? = null
        adapter = LibrarianAdapter(dataLibrarians)
        layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        recyclerViewLibrarian.layoutManager = layoutManager
        recyclerViewLibrarian.adapter = adapter
    }
}