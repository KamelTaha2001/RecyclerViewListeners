package com.kamel.recyclerviewexercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), AdapterClickable {

    private lateinit var recyclerView: RecyclerView
    private val data = listOf(
        MyData("John"), MyData("Rami"), MyData("Haytham")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rvView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyAdapter(data, this)
    }

    override fun onClickListener(position: Int) {
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("position", position)
        intent.putExtra("name", data[position].name)
        startActivity(intent)
        finish()
    }
}