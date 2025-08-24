package com.example.movie

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main8)

        // Adjust padding for edge-to-edge display
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Bottom navigation setup
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNav.selectedItemId = R.id.nav_feed
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    startActivity(Intent(this, MainActivity5::class.java))
                    true
                }

                R.id.nav_feed -> true
                R.id.nav_find -> {
                    startActivity(Intent(this, MainActivity7::class.java))
                    true
                }

                R.id.nav_profile -> {
                    startActivity(Intent(this, MainActivity9::class.java))
                    true
                }

                else -> false
            }
        }

        // Get references to buttons
        val tvSeriesButton = findViewById<Button>(R.id.btnMovies)
        val booksButton = findViewById<Button>(R.id.btnBooks)

        tvSeriesButton.setOnClickListener {
            startActivity(Intent(this, MainActivity6::class.java))
        }

        booksButton.setOnClickListener {
            startActivity(Intent(this, MainActivity10::class.java))
        }
    }
}
