package com.example.spotifyapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductoAdapter: RecyclerView.Adapter<ProductoAdapter.ViewHoler>() {

    private var titles = arrayOf("Como Estrellas Radio","Éxitos España","Todo Indie","Música sin copyright","Descubrimiento semanal")
    private var images =  intArrayOf(R.drawable.titlephto,R.drawable.titlephto,R.drawable.titlephto,R.drawable.titlephto,R.drawable.titlephto,)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductoAdapter.ViewHoler {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.view_holer_cateloryhome,parent,false)
        return ViewHoler(v)
    }

    override fun onBindViewHolder(holder: ViewHoler, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    inner class ViewHoler(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle : TextView

        init {
            itemImage = itemView.findViewById(R.id.itemImage)
            itemTitle = itemView.findViewById(R.id.itemTitle)
        }
    }
}