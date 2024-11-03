package com.example.first

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Apply window insets to handle system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find the Messages icon layout
        val messagesLayout: LinearLayout = findViewById(R.id.messages_layout)

        // Set click listener for the Messages icon
        messagesLayout.setOnClickListener {
            // Navigate to MessagesActivity
            val intent = Intent(this, MessagesActivity::class.java)
            startActivity(intent)
        }




        // Find the Notifications icon layout
        val notificationsLayout: LinearLayout = findViewById(R.id.notifications_layout)

        // Set click listener for the Notifications icon
        notificationsLayout.setOnClickListener {
            val intent = Intent(this, NotificationsActivity::class.java)
            startActivity(intent)
        }
    }
}
