package com.example.my1stapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class LogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.log_activity)  // Ensure this is the correct layout file

        // Find the nav_arrow ImageView and set a click listener
        val nav_arrow = findViewById<ImageView>(R.id.nav_arrow)
        nav_arrow.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
            finish()  // Optionally close LogActivity
        }
    }
}
