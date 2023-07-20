package com.kamel.recyclerviewexercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val tvInfo :TextView? = findViewById(R.id.tvInfo)
        val name = intent.getStringExtra("name")
        val number = intent.getIntExtra("position", 0).toString()
        tvInfo?.text = "$name - $number"

        val btnBack : Button? = findViewById(R.id.btnBack)
        btnBack?.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}