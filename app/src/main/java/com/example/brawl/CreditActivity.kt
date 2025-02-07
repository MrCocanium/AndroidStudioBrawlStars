package com.example.brawl

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CreditActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credit)

        val userName = intent.getStringExtra("USER_NAME")
        val textView: TextView = findViewById(R.id.creditTextView)
        val contactButton: Button = findViewById(R.id.contactButton)

        textView.text = "$userName, estás usando la versión 1.1 de Brawl Stars Guide App. \n\nDescripción de la app: Esta app es una herramienta para jugadores de Brawl Stars."

        contactButton.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "tu-email@dominio.com", null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Consulta de la app Brawl Stars")
            startActivity(Intent.createChooser(emailIntent, "Enviar correo"))
        }
    }
}
