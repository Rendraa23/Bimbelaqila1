package com.example.bimbelaqila

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class harga : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_harga)

        val button = findViewById<Button>(R.id.harrequler)
        button.setOnClickListener {
            val Intent = Intent(this, harga_reguler::class.java)
            startActivity(Intent)
        }

        val button2 = findViewById<Button>(R.id.harprivat)
        button2.setOnClickListener {
            val Intent = Intent(this, harga_privat::class.java)
            startActivity(Intent)
        }
    }
}