package com.example.movie

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigation)

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_find -> {

                    val intent = Intent(this, MainActivity5::class.java)
                    startActivity(intent)
                    true

                }
                R.id.nav_feed -> {
                    val intent = Intent(this, MainActivity6::class.java)
                    startActivity(intent)
                    true
                }
                R.id.nav_home -> {
                     val intent = Intent(this, MainActivity7::class.java)
                    startActivity(intent)
                    true
                }
                R.id.nav_saved -> {
                   // val intent = Intent(this, MainActivity8::class.java)
                    startActivity(intent)
                    true
                }
                R.id.nav_profile -> {
                   // val intent = Intent(this, MainActivity9::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }

    }
}
