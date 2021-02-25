package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.sendButton)
        btn.setOnClickListener {
            val intent = Intent(application, ScreenSlidePagerActivity::class.java)
            startActivity(intent)
        }
    }
}