package com.example.movie

import android.content.Intent
import android.os.Bundle
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

        // Edge-to-edge padding
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // BottomNavigationView setup
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigation)

        // Set current selected item
        bottomNav.selectedItemId = R.id.nav_saved

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
                    // Already in this activity
                    true
                }
                R.id.nav_profile -> {
                    startActivity(Intent(this, MainActivity9::class.java))
                    true
                }
                else -> false
            }
        }
    }
}
