package com.example.loginvideo


import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), MediaPlayer.OnPreparedListener {

    lateinit var videoview:VideoView
    lateinit var sharedPreferences: SharedPreferences
    lateinit var edt1:EditText
    lateinit var edt2:EditText
    lateinit var btn1:Button



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        videoview = findViewById(R.id.videoView)
        edt1 = findViewById(R.id.edt1)
        edt2 = findViewById(R.id.edt2)
        btn1 = findViewById(R.id.btn1)

        sharedPreferences = getSharedPreferences("USER_SESSION", Context.MODE_PRIVATE)


        if(sharedPreferences.getBoolean("USER_SESSION",false) && !sharedPreferences.getString("email","")!!.isEmpty())
        {
            startActivity(Intent(this,DashboardActivity::class.java))
            finish()
        }



        val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.vidanim)
        videoview.setVideoURI(uri)
        videoview.start()


        videoview.setOnPreparedListener(this)


        btn1.setOnClickListener {

            var email = edt1.text.toString()
            var pass = edt2.text.toString()

            var editor:SharedPreferences.Editor = sharedPreferences.edit()
            editor.putBoolean("USER_SESSION",true)
            editor.putString("email",email)
            editor.putString("pass",pass)
            editor.commit()

            startActivity(Intent(applicationContext,DashboardActivity::class.java))

        }
    }

    override fun onPrepared(p0: MediaPlayer?) {
        p0!!.isLooping = true
    }


    override fun onResume() {

        videoview.resume()
        super.onResume()
    }
}