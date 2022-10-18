package com.example.spotifyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : AppCompatActivity() {

    private val titles = arrayListOf<String>("Como Estrellas Radio","Éxitos España","Todo Indie","Música sin copyright","Descubrimiento semanal")
    private var images =  arrayListOf<Int>(R.drawable.titlephto,R.drawable.titlephto,R.drawable.titlephto,R.drawable.titlephto,R.drawable.titlephto,)


    private var layoutManager:RecyclerView.LayoutManager? = null

    private var adapter: RecyclerView.Adapter<SimpleAdapter.ViewHolder>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_home)
        layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
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
    fun onClickIconSettingBar(view: View){
        startActivity(Intent(this,SettingActivity::class.java))
    }


}