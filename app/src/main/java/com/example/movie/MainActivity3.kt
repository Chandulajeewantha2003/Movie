package com.example.movie

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val emailEditText: EditText = findViewById(R.id.editTextEmail)
        val usernameEditText: EditText = findViewById(R.id.editTextUsername)
        val loginButton: Button = findViewById(R.id.loginButton)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString().trim()
            val email = emailEditText.text.toString().trim()

            if (username.isEmpty() || email.isEmpty()) {
                Toast.makeText(this, "Please enter both username and email", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Welcome, $username!", Toast.LENGTH_SHORT).show()

                // ✅ Navigate to MainActivity4
                val intent = Intent(this, MainActivity4::class.java)
                startActivity(intent)

                // Optional: finish current activity if you don't want to come back on back press
                finish()
            }
        }
    }
}
