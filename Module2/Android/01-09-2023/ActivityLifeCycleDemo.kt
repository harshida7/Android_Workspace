package com.example.assignment_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ActivityLifeCycleDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle_demo)

        val toast = Toast.makeText(applicationContext, "OnCreated Called", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()

        val toast = Toast.makeText(applicationContext, "OnStart Called", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()

        val toast = Toast.makeText(applicationContext, "OnRestart Called", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()

        val toast =  Toast.makeText(applicationContext, "OnResume Called", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()

       val toast =  Toast.makeText(applicationContext, "OnPause Called", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()

        val toast = Toast.makeText(applicationContext,"OnStop Called",Toast.LENGTH_SHORT).show()

    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(applicationContext, "OnDestroy Called", Toast.LENGTH_SHORT).show()
    }
}