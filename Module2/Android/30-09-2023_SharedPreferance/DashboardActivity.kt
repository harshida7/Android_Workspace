package com.example.loginvideo

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DashboardActivity : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences
    lateinit var txt1:TextView
    lateinit var btn1:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        sharedPreferences = getSharedPreferences("USER_SESSION", Context.MODE_PRIVATE)
        txt1 = findViewById(R.id.txt1)
        btn1 = findViewById(R.id.btn2)

        txt1.setText("Welcome "+sharedPreferences.getString("email",""))

        btn1.setOnClickListener {

            sharedPreferences.edit().clear().commit()
            finish()
            startActivity(Intent(applicationContext,MainActivity::class.java))

        }
    }
}