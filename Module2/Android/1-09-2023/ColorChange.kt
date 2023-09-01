package com.example.assignment_app

import android.annotation.SuppressLint
import android.content.ComponentName
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout

class ColorChange : AppCompatActivity() {

    lateinit var btnred: Button
    lateinit var btngreen: Button
    lateinit var btnblue: Button
    lateinit var btnChange:Button
    lateinit var bg:RelativeLayout

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_change)

        btnred = findViewById(R.id.btnRed)
        btngreen = findViewById(R.id.btngreen)
        btnblue = findViewById(R.id.btnBlue)
        btnChange = findViewById(R.id.btnChnge)
        bg=findViewById(R.id.L1)

        btnred.setOnClickListener {
            bg.setBackgroundColor(Color.RED)


        }

        btngreen.setOnClickListener {
            bg.setBackgroundColor(Color.GREEN)


        }

        btnblue.setOnClickListener {
            bg.setBackgroundColor(Color.BLUE)


        }

        btnChange.setOnClickListener {
            var i = Intent(applicationContext,NavigatePassData::class.java)
            startActivity(i)
        }
    }
}