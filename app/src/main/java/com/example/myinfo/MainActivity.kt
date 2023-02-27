package com.example.myinfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonClick = findViewById(R.id.button_click1)
        buttonClick.setOnClickListener {
            Toast.makeText(this,R.string.MyInfo,Toast.LENGTH_SHORT).show()
        }

        buttonClick = findViewById(R.id.button_click2)
        buttonClick.setOnClickListener {
            Toast.makeText(this,R.string.MyInfo,Toast.LENGTH_SHORT).show()
            Toast.makeText(this,R.string.MyInfo,Toast.LENGTH_SHORT).show()
        }

        buttonClick = findViewById(R.id.button_click3)
        buttonClick.setOnClickListener {
            Toast.makeText(this,R.string.MyInfo,Toast.LENGTH_SHORT).show()
            Toast.makeText(this,R.string.MyInfo,Toast.LENGTH_SHORT).show()
            Toast.makeText(this,R.string.MyInfo,Toast.LENGTH_SHORT).show()
        }

    }

    private lateinit var buttonClick:Button


}