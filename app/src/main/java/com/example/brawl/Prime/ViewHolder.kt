package com.example.brawl.Prime

import android.view.View
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.brawl.R
import com.example.brawl.databinding.ContenidoBrawlBinding
import com.example.brawl.databinding.FragmentMenuBinding

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val binding = ContenidoBrawlBinding.bind(view)

    fun render(BrawlerModel: Brawler, onClickListener: (Brawler) -> Unit) {
        binding.tvBrawlerName.text = BrawlerModel.nombre
        binding.tvBrawlerRarity.text = BrawlerModel.rareza
        binding.tvBrawlerDescription.text = BrawlerModel.clase
        Glide.with(binding.ivBrawler.context).load(BrawlerModel.foto).into(binding.ivBrawler)

        // Mantener sincronizado el estado del favorito
        binding.fav.isChecked = BrawlerModel.isFavorito

        binding.fav.setOnClickListener {
            BrawlerModel.isFavorito = !BrawlerModel.isFavorito  // Cambia el estado
            binding.fav.isChecked = BrawlerModel.isFavorito  // Asegura la sincronización
            if (BrawlerModel.isFavorito) {
                Memoria.addFavs(BrawlerModel.nombre)
                Toast.makeText(binding.ivBrawler.context, "Añadido a favoritos", Toast.LENGTH_SHORT).show()
            } else {
                Memoria.removefavs(BrawlerModel.nombre)
                Toast.makeText(binding.ivBrawler.context, "Eliminado de favoritos", Toast.LENGTH_SHORT).show()
            }
        }

        binding.ivBrawler.setOnClickListener {
            Toast.makeText(binding.ivBrawler.context, BrawlerModel.nombre, Toast.LENGTH_SHORT).show()
        }

        itemView.setOnClickListener {
            onClickListener(BrawlerModel)
        }
    }
}
