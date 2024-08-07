package com.example.multiapp.greetingsapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.multiapp.R
import com.example.multiapp.greetingsapp.FirstAppActivity.Companion.NAME

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvResult = findViewById<TextView>(R.id.tvResult)
        val name = intent.extras?.getString(NAME).orEmpty()

        tvResult.text = "Hola $name"
    }
}