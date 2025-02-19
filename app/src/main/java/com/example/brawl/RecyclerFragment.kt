package com.example.brawl

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.ui.setupWithNavController
import com.example.brawl.Prime.NosequeViewModel
import com.example.brawl.databinding.FragmentMenuBinding
import com.example.brawl.databinding.FragmentRecyclerBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class RecyclerFragment : Fragment() {
    private var _binding: FragmentRecyclerBinding? = null
    private val binding get() = _binding!!
    private val args : RecyclerFragmentArgs by navArgs()
    private val viewModel : NosequeViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        viewModel.felixapruebame(args.nombre)
        _binding=FragmentRecyclerBinding.inflate(inflater,container, false)
         val view =binding.root
        ViewCompat.setOnApplyWindowInsetsListener(view) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val navController = childFragmentManager.findFragmentById(R.id.navHostFragment)
            ?.findNavController()
        if (navController != null) {
            binding.bottomNav.setupWithNavController(navController)
        }
        val bundle = Bundle()
        bundle.putString("miau",args.nombre)
        return view
    }
}