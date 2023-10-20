package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    private lateinit var  button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        button= findViewById(R.id.button3)
        button.setOnClickListener{
            val intent = Intent(this@LoginActivity,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}