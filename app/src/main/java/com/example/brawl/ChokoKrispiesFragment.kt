package com.example.brawl

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.navArgs
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.brawl.databinding.FragmentChokoKrispiesBinding
import com.google.android.material.badge.BadgeDrawable
import com.google.android.material.tabs.TabLayoutMediator

class ChokoKrispiesFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentChokoKrispiesBinding? = null
    private val binding get() = _binding!!
    val args : ChokoKrispiesFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding=FragmentChokoKrispiesBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nombreRaro = args.nombre
        binding.vpCredit.adapter=NoticiaAdaptador(this, nombreRaro)
        TabLayoutMediator(binding.TabMenu,binding.vpCredit){
                tab, position ->
            when(position){
                1->{
                    tab.text="Menu de Inicio"
                    tab.setIcon(R.drawable.ic_home)
                    val badge : BadgeDrawable = tab.orCreateBadge
                    badge.backgroundColor = ContextCompat.getColor(requireContext().applicationContext,R.color.red)
                    badge.number=117
                    badge.maxCharacterCount=3
                    badge.badgeGravity=BadgeDrawable.TOP_START
                }
                0->{
                    tab.text="Creditos"
                    tab.setIcon(R.drawable.ic_credit)
                }
            }
        }.attach()
    }
}

class NoticiaAdaptador (fragment: Fragment, private val nombre : String) : FragmentStateAdapter(fragment){
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        val fragment = if(position==1)
            MenuFragment().apply {
                arguments = Bundle().apply {
                    putString("nombre", nombre)
                }
            }
        else
            Credit_Fragment().apply {
                arguments = Bundle().apply {
                    putString("nombre", nombre)
                }
            }
        return fragment
    }
}