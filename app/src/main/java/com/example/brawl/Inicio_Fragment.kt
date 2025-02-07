package com.example.brawl

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.brawl.databinding.FragmentInicioBinding

class Inicio_Fragment : Fragment() {
    private var _binding : FragmentInicioBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInicioBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.navigateButton.setOnClickListener{
            val userName = binding.userNameEditText.text
            val request=Inicio_FragmentDirections
                .actionInicioFragmentToChokoKrispiesFragment(nombre = userName.toString())
            findNavController().navigate(request)
        }
    }
}