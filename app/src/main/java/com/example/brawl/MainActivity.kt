package com.example.brawl


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.brawl.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding : ActivityMainBinding? = null
    private val binding get() = _binding!!

    //private lateinit var userNameEditText: EditText
    //private lateinit var navigateButton: Button
    //private lateinit var welcomeTextView: TextView
    //private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //setContentView(R.layout.activity_main)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


//incluye un controlador de navegacion. fragmentcontainerView2 es el host de navegación.
        val navFragment = supportFragmentManager.findFragmentById(R.id.FragmentoContenedor) as NavHostFragment
        val navController = navFragment.navController
//establece la barra con controles
        NavigationUI.setupActionBarWithNavController(this,navController)


       /* userNameEditText = findViewById(R.id.userNameEditText)
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
        }*/
    }


    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.FragmentoContenedor)
        return navController.navigateUp()
    }
}
