package com.example.brawl

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.setPadding
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.brawl.Prime.BrawlAdapter
import com.example.brawl.Prime.BrawlProvider
import com.example.brawl.Prime.Brawler
import com.example.brawl.databinding.FragmentCajaZapatoBinding

class CajaZapatoFragment : Fragment() {
    private var _binding : FragmentCajaZapatoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCajaZapatoBinding.inflate(inflater, container, false)
        val view = binding.root

        ViewCompat.setOnApplyWindowInsetsListener(view) {v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initRecyclerView()
        return view
    }

    private fun initRecyclerView(){
        val manager = LinearLayoutManager(requireContext())
        binding.primerPeru.layoutManager = manager
        binding.primerPeru.adapter = BrawlAdapter(BrawlProvider.listaBrawlers) { brawler ->
            onItemSelected(brawler)
        }
    }



    private fun onItemSelected(brawler : Brawler) {
        //Toast.makeText(requireContext(), brawler.nombre, Toast.LENGTH_SHORT).show()
        val bundle = Bundle().apply {
            putParcelable("brawler", brawler)
        }
        findNavController().navigate(R.id.action_cajaZapatoFragment_to_stemdoFragment, bundle)
    }
}