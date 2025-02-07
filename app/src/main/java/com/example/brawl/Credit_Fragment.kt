package com.example.brawl

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.brawl.databinding.FragmentChokoKrispiesBinding
import com.example.brawl.databinding.FragmentCreditBinding

class Credit_Fragment : Fragment() {
    private var _binding: FragmentCreditBinding? = null
    private val binding get() = _binding!!
    private val args: Credit_FragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding=FragmentCreditBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvdescrip.text = getString(R.string.mensaje,args.nombre)
        binding.botn.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "tu-email@dominio.com", null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Consulta de la app Brawl Stars")
            startActivity(Intent.createChooser(emailIntent, "Enviar correo"))
        }
    }
}