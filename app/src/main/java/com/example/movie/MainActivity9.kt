package com.example.movie

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main9)

        // Apply edge-to-edge system bar padding
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Bottom Navigation setup
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigation)

        // Mark current selected item
        bottomNav.selectedItemId = R.id.nav_profile

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_find -> {
                    startActivity(Intent(this, MainActivity5::class.java))
                    true
                }
                R.id.nav_feed -> {
                    startActivity(Intent(this, MainActivity6::class.java))
                    true
                }
                R.id.nav_home -> {
                    startActivity(Intent(this, MainActivity7::class.java))
                    true
                }
                R.id.nav_saved -> {
                    startActivity(Intent(this, MainActivity8::class.java))
                    true
                }
                R.id.nav_profile -> {
                    // Already in this activity
                    true
                }
                else -> false
            }
        }
    }
}
