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
import kotlinx.android.synthetic.main.activity_search_main.*

class MainActivity : AppCompatActivity() {

    private val titles = arrayListOf<String>("Como Estrellas Radio","Éxitos España","Todo Indie","Música sin copyright","Descubrimiento semanal")
    private var images =  arrayListOf<Int>(R.drawable.titlephto,R.drawable.titlephto,R.drawable.titlephto,R.drawable.titlephto,R.drawable.titlephto,)


    private var layoutManager:RecyclerView.LayoutManager? = null

    private var adapter: RecyclerView.Adapter<SimpleAdapter.ViewHolder>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myToolbar()


        layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyHome.layoutManager = layoutManager
        adapter = SimpleAdapter(titles,images)
        recyHome.adapter = adapter

        recyHome1()
        getBottomNaviga()

    }
    private fun recyHome1(){
         var adapter1: RecyclerView.Adapter<ProductoAdapter.ViewHoler>? = null
         var layoutManager:RecyclerView.LayoutManager? = null
         adapter1 = ProductoAdapter()
        layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyHome1.layoutManager = layoutManager
         recyHome1.adapter = adapter1
    }

    private fun myToolbar(){
        lateinit var mytoolbar: Toolbar
        mytoolbar = findViewById(R.id.toolbar)
        setSupportActionBar(mytoolbar)
    }
    fun actionIntent(view: View){
        startActivity(Intent(this@MainActivity,playmusic::class.java))
    }
    fun actionIntent1(view: View){
        startActivity(Intent(this@MainActivity,AlbumPlayMusic::class.java))
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