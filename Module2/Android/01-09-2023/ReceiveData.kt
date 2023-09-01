package com.example.assignment_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ReceiveData : AppCompatActivity()
{
    lateinit var txtRec1:TextView

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receive_data)

        txtRec1 = findViewById(R.id.txtRec)

        var txtReceive=intent.getStringExtra("Key1")

        txtRec1.setText(txtReceive)

    }
}