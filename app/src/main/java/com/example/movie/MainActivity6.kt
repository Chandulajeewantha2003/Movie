package com.example.movie

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main6)

        // Apply padding for system bars (edge-to-edge)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // BottomNavigationView setup
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigation)

        // Set selected item for current activity
        bottomNav.selectedItemId = R.id.nav_feed

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_find -> {

                    val intent = Intent(this, MainActivity5::class.java)
                    startActivity(intent)
                    true

                }
                R.id.nav_feed -> {
                    // Already in this activity
                    true
                }
                R.id.nav_home -> {
                     val intent = Intent(this, MainActivity7::class.java)
                    startActivity(intent)
                    true
                }
                R.id.nav_saved -> {
                //    val intent = Intent(this, MainActivity8::class.java)
                    startActivity(intent)
                    true
                }
                R.id.nav_profile -> {
                 //   val intent = Intent(this, MainActivity9::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
    }
}
