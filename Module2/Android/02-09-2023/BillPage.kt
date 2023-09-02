package com.example.cafeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BillPage : AppCompatActivity() {
    lateinit var TxtBill : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bill_page)

        TxtBill = findViewById(R.id.txtBill)

        var i = intent

        TxtBill.setText(i.getStringExtra("bill"))


    }
}