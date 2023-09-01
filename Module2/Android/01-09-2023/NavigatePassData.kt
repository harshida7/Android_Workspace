package com.example.assignment_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class NavigatePassData : AppCompatActivity() {

    lateinit var  ed1:EditText
    lateinit var btn1:Button

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigate_pass_data)

        ed1=findViewById(R.id.edt1)
        btn1=findViewById(R.id.btnPass)

        btn1.setOnClickListener {

            var txtPass= ed1.text.toString()
            var i  = Intent(applicationContext,ReceiveData::class.java)
            i.putExtra("Key1",txtPass)
            startActivity(i)

        }

    }
}