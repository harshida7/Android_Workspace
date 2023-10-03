package com.example.task_3_10_23

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ViewSubmitData : AppCompatActivity() {

    lateinit var txtShow:TextView

    lateinit var sharedPreferences: SharedPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_submit_data)

        txtShow = findViewById(R.id.txtShowData)
        sharedPreferences = getSharedPreferences("USER_SESSION", Context.MODE_PRIVATE)


        txtShow.append("\n \n Your First Name: "+sharedPreferences.getString("fnm","error"))
        txtShow.append("\n \nYour Last Name: "+sharedPreferences.getString("lnm","error"))
        txtShow.append("\n \nYour Email: "+sharedPreferences.getString("email","error"))
        txtShow.append("\n \nYour Password: "+sharedPreferences.getString("pass","error"))
        txtShow.append("\n \nYour Gender: "+sharedPreferences.getString("gender","error"))
        txtShow.append("\n \nYour Hobbies: "+sharedPreferences.getString("hobby","error"))
        txtShow.append("\n \nYour Date Of Birth: "+sharedPreferences.getString("dob","error"))
        txtShow.append("\n \nYour Time: "+sharedPreferences.getString("time","error"))






    }
}