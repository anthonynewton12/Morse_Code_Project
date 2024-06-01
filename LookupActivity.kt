package com.example.morsecodeproject

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LookupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lookup)
        

        fun morseClick(view: View) {
            if (view is TextView) {
                Log.d("LookupActivity", "Button tapped")
                val linearLayout = view as LinearLayout

                val textView = linearLayout.getChildAt(0) as TextView
                val capturedText = textView.text.toString()

                when (linearLayout) {
                    findViewById(R.id.llLetters) -> {
                        intent.putExtra("symbol", capturedText)
                    }
                    findViewById(R.id.llDigits) -> {
                        intent.putExtra("morse", capturedText)
                    }
                    findViewById(R.id.llPunc) -> {
                        intent.putExtra("morse", capturedText)
                    }
                }

                setResult(Activity.RESULT_OK, intent)
                finish()
            }

        }
    }

}

