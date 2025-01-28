package com.example.brawl


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var userNameEditText: EditText
    private lateinit var navigateButton: Button
    private lateinit var welcomeTextView: TextView
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userNameEditText = findViewById(R.id.userNameEditText)
        navigateButton = findViewById(R.id.navigateButton)
        welcomeTextView = findViewById(R.id.welcomeTextView)
        imageView = findViewById(R.id.imageView)

        // Texto de bienvenida
        welcomeTextView.text = "¡Bienvenido a Brawl Stars!"

        navigateButton.setOnClickListener {
            val userName = userNameEditText.text.toString()
            val intent = Intent(this, CreditActivity::class.java)
            intent.putExtra("USER_NAME", userName)
            startActivity(intent)
        }
    }
}
