package com.example.morsecodeproject

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SendActivity : AppCompatActivity() {
    private lateinit var lastLookupTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send)

        lastLookupTextView = findViewById(R.id.lastLookupTextView)

        val lookupButton = findViewById<Button>(R.id.lookupButton)
        lookupButton.setOnClickListener {
            // Start the LookupActivity when the Lookup button is clicked
            startActivityForResult(Intent(this, LookupActivity::class.java), 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 1 && resultCode == Activity.RESULT_OK && data != null) {
            // Handle the symbol/morse pair received from LookupActivity
            val symbol = data.getStringExtra("symbol")
            val morse = data.getStringExtra("morse")

            // Update the Last Lookup TextView
            lastLookupTextView.text = "Last Lookup: Symbol=$symbol, Morse=$morse"
        }
    }
}
