package com.example.brawl

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.brawl.Prime.NosequeViewModel
import com.example.brawl.databinding.FragmentInfoUserBinding
import com.example.brawl.databinding.FragmentRecyclerBinding

class InfoUserFragment : Fragment() {
    private var _binding: FragmentInfoUserBinding? = null
    private val binding get() = _binding!!
    private val viewModel : NosequeViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding=FragmentInfoUserBinding.inflate(inflater,container, false)
        viewModel.argumento.observe(viewLifecycleOwner) {arguments ->
            binding.presentation.text = getString(R.string.infouser,arguments)
        }
        return binding.root

    }

}