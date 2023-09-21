package com.example.assignment_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class LoginScreen : AppCompatActivity() {
    lateinit var btnLog : Button

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        btnLog = findViewById(R.id.btnLog)

        btnLog.setOnClickListener {

            Toast.makeText(applicationContext, "User Clicked On Login Button", Toast.LENGTH_SHORT).show()
        }
    }
}