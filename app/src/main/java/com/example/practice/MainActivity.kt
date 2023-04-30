package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val button = findViewById<Button>(R.id.buttonPI)
        button.setOnClickListener({
            val nextPage = Intent(this, SecondActivity2::class.java)
            startActivity(nextPage)
            finish()
        })

        val button2 = findViewById<Button>(R.id.buttonKN)
        button2.setOnClickListener({
            val nextPage1 = Intent(this, SecondActivity2::class.java)
            startActivity(nextPage1)
            finish()
        })

        val button3 = findViewById<Button>(R.id.buttonEVI)
        button3.setOnClickListener({
            val nextPage2 = Intent(this, SecondActivity2::class.java)
            startActivity(nextPage2)
            finish()
        })
    }





}