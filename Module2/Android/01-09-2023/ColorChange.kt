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
    lateinit var btnLogin:Button
    lateinit var btnReg:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_change)

        btnred = findViewById(R.id.btnRed)
        btngreen = findViewById(R.id.btngreen)
        btnblue = findViewById(R.id.btnBlue)
        btnChange = findViewById(R.id.btnChnge)
        bg  = findViewById(R.id.L1)
        btnLogin=findViewById(R.id.btnLogin)
        btnReg = findViewById(R.id.btnRegister)

        btnred.setOnClickListener {
            bg.setBackgroundColor(Color.MAGENTA)
        }

        btngreen.setOnClickListener {
            bg.setBackgroundColor(Color.CYAN)
        }

        btnblue.setOnClickListener {
            bg.setBackgroundColor(Color.GRAY)
        }

        btnChange.setOnClickListener {
            var i = Intent(applicationContext,NavigatePassData::class.java)
            startActivity(i)
        }

        btnLogin.setOnClickListener {
            var i = Intent(applicationContext,LoginScreen::class.java)
            startActivity(i)
        }

        btnReg.setOnClickListener {
            var i = Intent(applicationContext,RegistrtionActivity::class.java)
            startActivity(i)
        }
    }
}