package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class RegisterActivity1 : AppCompatActivity() {
    private lateinit var  button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register1)
        button= findViewById(R.id.button3)
        button.setOnClickListener{
            val intent = Intent(this@RegisterActivity1,LoginActivity::class.java)
            startActivity(intent)
        }

    }

}