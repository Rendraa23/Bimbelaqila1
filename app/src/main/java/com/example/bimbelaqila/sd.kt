package com.example.bimbelaqila

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sd)


        val button = findViewById<Button>(R.id.reqsd)
        button.setOnClickListener {
            val Intent = Intent(this, reqsd::class.java)
            startActivity(Intent)
        }

        val button2 = findViewById<Button>(R.id.privsd)
        button2.setOnClickListener {
            val Intent = Intent(this, privsd::class.java)
            startActivity(Intent)
        }
    }
}