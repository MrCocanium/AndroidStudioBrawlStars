package com.example.brawl

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.lifecycle.Lifecycle
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
        /*val menuHost: MenuHost = requireActivity()
        menuHost.addMenuProvider(object : MenuProvider {
            override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
                menuInflater.inflate(R.menu.pedrin, menu)
            }

            override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
                return when (menuItem.itemId) {
                    R.id.pedrin -> {
                        findNavController().navigate(R.id.action_inicio_Fragment_to_cajaZapatoFragment2)
                        true
                    }
                    R.id.yonki -> {
                        findNavController().navigate(R.id.action_inicio_Fragment_to_favouriteFragment2)
                        true
                    }
                    R.id.josefa -> {
                        findNavController().navigate(R.id.action_inicio_Fragment_to_infoUserFragment2)
                        true
                    }
                    else -> false
                }
            }
        }, viewLifecycleOwner, Lifecycle.State.RESUMED)*/
    }
}