package com.example.bimbelaqila

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class smp : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smp)

        val button = findViewById<Button>(R.id.reqsmp)
        button.setOnClickListener {
            val Intent = Intent(this, reqsmp::class.java)
            startActivity(Intent)
        }

        val button22 = findViewById<Button>(R.id.privsmp)
        button22.setOnClickListener {
            val Intent = Intent(this, privsmp::class.java)
            startActivity(Intent)
        }
    }
}