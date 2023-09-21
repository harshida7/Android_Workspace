package com.example.assignment_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class RegistrtionActivity : AppCompatActivity() {

    lateinit var btnRegs:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrtion)

        btnRegs = findViewById(R.id.btnReg1)

        btnRegs.setOnClickListener {
            Toast.makeText(applicationContext, "You Clicked On Register Details", Toast.LENGTH_SHORT).show()
        }
    }
}