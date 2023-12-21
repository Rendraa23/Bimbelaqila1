package com.example.bimbelaqila

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Tk : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tk)

        val button = findViewById<Button>(R.id.regulertk)
        button.setOnClickListener {
            val Intent = Intent(this, reguler_tk::class.java)
            startActivity(Intent)
        }

        val button1 = findViewById<Button>(R.id.privtk)
        button1.setOnClickListener {
            val Intent = Intent(this, privtk::class.java)
            startActivity(Intent)
        }
    }
}