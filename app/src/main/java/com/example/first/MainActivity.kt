package com.example.first
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button
    private lateinit var emailEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        emailEditText = findViewById(R.id.email_edit_text)  // Ensure this ID is in your XML
        passwordEditText = findViewById(R.id.password_edit_text)
        loginButton = findViewById(R.id.login_button)

        loginButton.setOnClickListener {
            handleLogin()
        }
    }

    private fun handleLogin() {
        // Get user input
        val email = emailEditText.text.toString()
        val password = passwordEditText.text.toString()

        // Simple validation check
        if (email.isNotEmpty() && password.isNotEmpty()) {
            // Navigate to HomeActivity
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish() // Optional: Close MainActivity
        } else {
            // Show error message if credentials are empty
            Toast.makeText(this, "Please enter valid credentials", Toast.LENGTH_SHORT).show()
        }
    }
}
