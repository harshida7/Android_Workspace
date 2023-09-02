package com.example.cafeapp

import android.Manifest.permission.CALL_PHONE
import android.content.DialogInterface
import android.content.Intent
import android.content.pm.PackageManager.PERMISSION_GRANTED
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AlertDialog
import java.lang.StringBuilder

class OrderShow : AppCompatActivity() {

    lateinit var chk1: CheckBox
    lateinit var chk2: CheckBox
    lateinit var chk3: CheckBox
    lateinit var btnOrder: Button
    lateinit var btnCall: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_show)

        chk1 = findViewById(R.id.chk1)
        chk2 = findViewById(R.id.chk2)
        chk3 = findViewById(R.id.chk3)
        btnOrder = findViewById(R.id.btnOrder)
        btnCall = findViewById(R.id.btnCall)

        if(checkSelfPermission(CALL_PHONE)!=PERMISSION_GRANTED)
        {
            requestPermissions(arrayOf(CALL_PHONE),1)
        }
        btnOrder.setOnClickListener {
            var amount = 0

            var builder = StringBuilder("Selected Items")

            if(chk1.isChecked){
            builder.append("\n Pizza @ Rs. 100")
                amount+= 100

            }
            if(chk2.isChecked){
                builder.append("\n Burger @ Rs. 70")
                amount+= 70

            }
            if(chk3.isChecked){
                builder.append("\n Coffe @ Rs. 120")
                amount+= 120

            }

            builder.append("\n Total : "+ amount)

            var i = Intent (applicationContext, BillPage :: class.java)
            i.putExtra("bill", builder.toString())
            startActivity(i)
       }

        btnCall.setOnClickListener {
            var num = "9099972756"
            var i = Intent(Intent.ACTION_CALL)
            i.setData(Uri.parse("tel:" + num))
            startActivity(i)

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