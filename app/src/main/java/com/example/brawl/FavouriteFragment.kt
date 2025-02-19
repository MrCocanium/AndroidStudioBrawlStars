package com.example.brawl

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.brawl.Prime.BrawlAdapter
import com.example.brawl.Prime.BrawlProvider
import com.example.brawl.Prime.Memoria
import com.example.brawl.databinding.FragmentFavouriteBinding
import com.example.brawl.databinding.FragmentInicioBinding

class FavouriteFragment : Fragment() {
    private var _binding : FragmentFavouriteBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: BrawlAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFavouriteBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
    }
    private fun initRecyclerView(){
        val listaFavoritos = BrawlProvider.listaBrawlers.filter { Memoria.esFav(it.nombre) }

        adapter = BrawlAdapter(listaFavoritos) { brawler ->

        }
        binding.segundoChile.layoutManager = LinearLayoutManager(requireContext())
        binding.segundoChile.adapter = adapter
    }

    override fun onResume() {
        super.onResume()
        initRecyclerView()
    }
}