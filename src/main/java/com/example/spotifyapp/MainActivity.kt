package com.example.spotifyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val titles = arrayListOf<String>("Como Estrellas Radio","Éxitos España","Todo Indie","Música sin copyright","Descubrimiento semanal")
    private var images =  arrayListOf<Int>(R.drawable.titlephto,R.drawable.titlephto,R.drawable.titlephto,R.drawable.titlephto,R.drawable.titlephto,)


    private var layoutManager:RecyclerView.LayoutManager? = null

    private var adapter: RecyclerView.Adapter<SimpleAdapter.ViewHolder>? = null

    private lateinit var mytoolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mytoolbar = findViewById(R.id.toolbar)
        layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        setSupportActionBar(mytoolbar)

        recyHome.layoutManager = layoutManager

        adapter = SimpleAdapter(titles,images)

        recyHome.adapter = adapter

        recyHome1()


    }
    private fun recyHome1(){
         var adapter1: RecyclerView.Adapter<ProductoAdapter.ViewHoler>? = null
         var layoutManager:RecyclerView.LayoutManager? = null
         adapter1 = ProductoAdapter()
        layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyHome1.layoutManager = layoutManager
         recyHome1.adapter = adapter1
    }
    fun actionIntent(view: View){
        startActivity(Intent(this@MainActivity,playmusic::class.java))
    }
    fun actionIntent1(view: View){
        startActivity(Intent(this@MainActivity,AlbumPlayMusic::class.java))
    }
}