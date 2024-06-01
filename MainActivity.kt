package com.example.morsecodeproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sendButton = findViewById<Button>(R.id.sendButton)
        val receiveButton = findViewById<Button>(R.id.receiveButton)
        val aboutButton = findViewById<Button>(R.id.aboutButton)

        sendButton.setOnClickListener {
            startActivity(Intent(this, SendActivity::class.java))
        }

        receiveButton.setOnClickListener {
            startActivity(Intent(this, ReceiveActivity::class.java))
        }

        aboutButton.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }
    }
}
