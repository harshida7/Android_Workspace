package com.example.module4_assignment

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import com.example.module4_assignment.R.*
import com.example.module4_assignment.R.id.add

class RadioButton : AppCompatActivity() {
    lateinit var edt1:EditText
    lateinit var edt2:EditText
    lateinit var btn1:Button
    lateinit var add:RadioButton
    lateinit var sub:RadioButton
    lateinit var mul:RadioButton
    lateinit var divi:RadioButton
    lateinit var txtRes : TextView
    lateinit var btnHide : Button
    lateinit var btnShow : Button
    lateinit var btnPdf : Button
     lateinit var btnGoAct : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_radio_button)

        edt1 = findViewById(id.edt1)
        edt2 = findViewById(id.edt2)
         btn1 = findViewById(id.btnRes)
        txtRes = findViewById(id.txtR)
        add= findViewById(R.id.add)
        sub= findViewById(R.id.sub)
        mul= findViewById(R.id.multi)
        divi= findViewById(R.id.div)
        btnHide = findViewById(R.id.btnHide)
        btnShow = findViewById(R.id.btnShow)
        btnPdf = findViewById(R.id.btnPdf)
        btnGoAct = findViewById(R.id.btnGoActivity)

        btn1.setOnClickListener {

              var num1 = Integer.parseInt(edt1.text.toString())
            var num2 = Integer.parseInt(edt2.text.toString())

            if(add.isChecked)
            {
                    var add= num1+num2
                      txtRes.setText("$add")
            }
            else if(sub.isChecked)
            {
                var sub= num1  - num2
                txtRes.setText("$sub")
            }

            else if(mul.isChecked)
            {
                var mul = num1  * num2
                txtRes.setText("$mul")

            }
            else if(divi.isChecked)
            {
                var div= num1/num2
                txtRes.setText("$div")

            }


        }


        btnHide.setOnClickListener {

            edt1.visibility = View.INVISIBLE
        }

        btnShow.setOnClickListener {

            edt1.visibility = View.VISIBLE
        }


        btnPdf.setOnClickListener {

            var url = "https://topsint.com/careercenter/assignment/android_assignment.pdf"

            var i = Intent(Intent.ACTION_VIEW)

                i.setData(Uri.parse(url))
            startActivity(i)


        }

        btnGoAct.setOnClickListener {
            var i = Intent(applicationContext,TextViewTableLAyout::class.java)
            startActivity(i)

        }

    }
}