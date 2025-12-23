package com.kgapp.nfcrw

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.LinearLayout
import android.view.Gravity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
        }

        val textView = TextView(this).apply {
            text = "Hello NFCReadWrite!"
            textSize = 24f
        }

        layout.addView(textView)
        setContentView(layout)
    }
}