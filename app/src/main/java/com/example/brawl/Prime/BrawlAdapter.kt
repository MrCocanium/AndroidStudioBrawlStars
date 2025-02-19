package com.example.brawl.Prime

import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.brawl.R

class BrawlAdapter(private val brawlerLista: List<Brawler>,private val onClickListener: (Brawler)-> Unit): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.contenido_brawl, parent, false))
    }

    override fun getItemCount(): Int = brawlerLista.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = brawlerLista[position]
        holder.render(item, onClickListener)
    }
}