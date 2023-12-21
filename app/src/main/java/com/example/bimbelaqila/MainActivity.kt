package com.example.bimbelaqila

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button1)
        button.setOnClickListener {
            val Intent = Intent(  this, Tk::class.java)
            startActivity(Intent)
        }
        val buttonsd = findViewById<Button>(R.id.button2)
        buttonsd.setOnClickListener {
            val Intent = Intent(  this, sd::class.java)
            startActivity(Intent)
        }

        val buttonsmp = findViewById<Button>(R.id.button3)
        buttonsmp.setOnClickListener {
            val Intent = Intent(  this, smp::class.java)
            startActivity(Intent)
        }

        val buttonsma = findViewById<Button>(R.id.button4)
        buttonsma.setOnClickListener {
            val Intent = Intent(  this, sma::class.java)
            startActivity(Intent)
        }

        val buttonharga = findViewById<Button>(R.id.button5)
        buttonharga.setOnClickListener {
            val Intent = Intent(this, harga::class.java)
            startActivity(Intent)
        }
    }
}