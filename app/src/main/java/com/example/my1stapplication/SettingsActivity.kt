package com.example.my1stapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.setting_activity)

        val nav_arrow = findViewById<ImageView>(R.id.nav_arrow)
        val log_icon = findViewById<ImageView>(R.id.log_icon)

        // Navigate to MainActivity
        nav_arrow.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        // Navigate to LoginActivity
        log_icon.setOnClickListener {
            val intent = Intent(this, LogActivity::class.java)
            // Optional: Clear all previous activities
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }
    }
}
