package com.example.brawl

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.brawl.Prime.Brawler
import com.example.brawl.databinding.FragmentCreditBinding
import com.example.brawl.databinding.FragmentStemdoBinding

class StemdoFragment : Fragment() {
    private var _binding: FragmentStemdoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding=FragmentStemdoBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val brawler = arguments?.getParcelable<Brawler>("brawler")

        brawler?.let {
            binding.tvBrawlerName.text = it.nombre
            binding.tvBrawlerRarity.text = it.rareza
            binding.tvBrawlerDescription.text = it.descripcion
            binding.tvBrawlerClase.text = it.clase

            Glide.with(this).load(it.foto).into(binding.ivBrawler)

        }
    }
}