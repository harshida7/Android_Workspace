package com.example.cafeapp

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class LoginPage : AppCompatActivity() {

    lateinit var e1:EditText
    lateinit var e2:EditText
    lateinit var b1:Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        e1=findViewById(R.id.edit1)
        e2=findViewById(R.id.edit2)
        b1=findViewById(R.id.btn1)

        b1.setOnClickListener {

            var name = e1.text.toString()
            var pass= e2.text.toString()

            if(name.length==0 && pass.length==0)
            {
                e1.setError("Please Enter Name")
                e2.setError("Please Enter Password")
            }
            else if(name.length==0)
            {
                e1.setError("Please Enter Name")
            }

            else if(pass.length==0)
            {
                e2.setError("Please Enter Password")
            }
            else
            {
                if(name == "Cafe" && pass == "12345") {
                    var i1 = Intent(applicationContext, OrderShow::class.java)
                    startActivity(i1)
                }
                else{
                    Toast.makeText(applicationContext, "Wrong Details", Toast.LENGTH_SHORT).show()
                }
            }



        }

    }

    override fun onBackPressed()
    {
        //finishAffinity()

        var alert = AlertDialog.Builder(this)
        alert.setTitle("Are you sure you want to exit?")
        alert.setPositiveButton("YES",{ dialogInterface: DialogInterface, i: Int ->

            finishAffinity()
        })
        alert.setNegativeButton("NO",{ dialogInterface: DialogInterface, i: Int ->

            dialogInterface.cancel()
        })
        alert.show()


    }
}