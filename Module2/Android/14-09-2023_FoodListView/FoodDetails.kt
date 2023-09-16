package com.example.customlisttaskfood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class FoodDetails : AppCompatActivity() {

    lateinit var img: ImageView
    lateinit var txtTitle: TextView
    lateinit var txtDuration:TextView
    lateinit var txtTime:TextView
    lateinit var txtIngrediantsTitle:TextView
    lateinit var txtIngrediantsDetails:TextView
    lateinit var txtStepsTitle:TextView
    lateinit var txtReceipe :TextView

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_details)

        img = findViewById(R.id.img1)
        txtTitle = findViewById(R.id.txtTitle)
        txtDuration = findViewById(R.id.txtDuration)
        txtTime = findViewById(R.id.txtTime)
        txtIngrediantsTitle = findViewById(R.id.txtIngrediantsTitle)
        txtIngrediantsDetails = findViewById(R.id.txtIngrediantsDetails)
        txtStepsTitle = findViewById(R.id.txtStepsTitle)
        txtReceipe = findViewById(R.id.txtReceipe)

        var i = intent

        img.setImageResource(i.getIntExtra("image",0))
        txtTitle.setText(i.getStringExtra("name"))
        txtTime.setText(i.getStringExtra("num"))
        txtIngrediantsDetails.setText(i.getStringExtra("method"))
        txtReceipe.setText(i.getStringExtra("steps"))


    }
}