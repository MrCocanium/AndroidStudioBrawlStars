package com.example.brawl

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.brawl.databinding.FragmentCreditBinding
import com.example.brawl.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {
    private var _binding: FragmentMenuBinding? = null
    private val binding get() = _binding!!
    private val args: MenuFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding=FragmentMenuBinding.inflate(inflater,container, false)
        return binding.root

        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.MainPrincipal.setOnClickListener {
         //findNavController().navigate(R.id.action_chokoKrispiesFragment_to_recyclerFragment)
         val piolin = ChokoKrispiesFragmentDirections.actionChokoKrispiesFragmentToRecyclerFragment(nombre = args.nombre)
         findNavController().navigate(piolin)
        }

        binding.volver.setOnClickListener{
            findNavController().navigate(R.id.action_chokoKrispiesFragment_to_inicio_Fragment)
        }
    }
    }
