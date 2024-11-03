package com.example.first

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MessagesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_messages)

        // Find the Compose button
        val composeButton: Button = findViewById(R.id.compose_button)

        // Set click listener for Compose Message button
        composeButton.setOnClickListener {
            // For now, just show a toast message
            Toast.makeText(this, "Compose Message clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
