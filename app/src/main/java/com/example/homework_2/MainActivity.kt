package com.example.homework_2

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button_to_activity_2)

        button.setOnClickListener(){
            setContentView(R.layout.activity_2)
            Toast.makeText(this, R.string.hello_world, Toast.LENGTH_SHORT).show()
        }
    }
}

