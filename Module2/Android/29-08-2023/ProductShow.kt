package com.example.amulproducts

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class ProductShow : AppCompatActivity() {

    lateinit var goldImg:ImageView
    lateinit var paneerImg:ImageView
    lateinit var gheeImg:ImageView
    lateinit var butterImg:ImageView
    lateinit var cheeseImg:ImageView
    lateinit var icecreamImg:ImageView
    lateinit var koolImg:ImageView

    lateinit var txt_gold:TextView
    lateinit var txt_paneer:TextView
    lateinit var txt_ghee:TextView
    lateinit var txt_butter:TextView
    lateinit var txt_cheese:TextView
    lateinit var txt_icecream:TextView
    lateinit var txt_kool:TextView

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_show)

        goldImg = findViewById(R.id.img1)
        butterImg = findViewById(R.id.img2)
        cheeseImg = findViewById(R.id.img3)
        gheeImg = findViewById(R.id.img4)
        icecreamImg = findViewById(R.id.img5)
        koolImg = findViewById(R.id.img6)
        paneerImg = findViewById(R.id.img7)

        txt_gold = findViewById(R.id.tp1)
        txt_butter = findViewById(R.id.tp2)
        txt_cheese = findViewById(R.id.tp3)
        txt_ghee = findViewById(R.id.tp4)
        txt_icecream = findViewById(R.id.tp5)
        txt_kool = findViewById(R.id.tp6)
        txt_paneer = findViewById(R.id.tp7)

        goldImg.setOnClickListener {

            //implicit
            var goldUrl="https://amul.com/products/amul-gold-info.php"
            var i = Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(goldUrl))
            startActivity(i)
        }

        txt_gold.setOnClickListener {

            Toast.makeText(applicationContext, "32 Rs", Toast.LENGTH_SHORT).show()
        }

        butterImg.setOnClickListener {

            //implicit
            var butterUrl="https://amul.com/products/amul-tablebutter-info.php"
            var i = Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(butterUrl))
            startActivity(i)
        }

        txt_butter.setOnClickListener {

            Toast.makeText(applicationContext, "200 Rs", Toast.LENGTH_SHORT).show()
        }

        cheeseImg.setOnClickListener {

            //implicit
            var cheeseUrl="https://amul.com/products/amul-processedcheese-info.php"
            var i = Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(cheeseUrl))
            startActivity(i)
        }

        txt_cheese.setOnClickListener {

            Toast.makeText(applicationContext, "210 Rs", Toast.LENGTH_SHORT).show()
        }

        gheeImg.setOnClickListener {

            //implicit
            var gheeUrl="https://amul.com/products/amul-ghee-info.php"
            var i = Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(gheeUrl))
            startActivity(i)
        }

        txt_ghee.setOnClickListener {

            Toast.makeText(applicationContext, "375 Rs", Toast.LENGTH_SHORT).show()
        }

        icecreamImg.setOnClickListener {

            //implicit
            var icecreamUrl="https://amul.com/products/amul-tricone-choco-crunch-icecream-info.php"
            var i = Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(icecreamUrl))
            startActivity(i)
        }

        txt_icecream.setOnClickListener {

            Toast.makeText(applicationContext, "50 Rs", Toast.LENGTH_SHORT).show()
        }

        koolImg.setOnClickListener {

            //implicit
            var koolUrl="https://amul.com/products/Amul-Kool-Flavoured-Milk.php"
            var i = Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(koolUrl))
            startActivity(i)
        }

        txt_kool.setOnClickListener {

            Toast.makeText(applicationContext, "30 Rs", Toast.LENGTH_SHORT).show()
        }

        paneerImg.setOnClickListener {

            //implicit
            var koolUrl="https://amul.com/products/amul-freshpaneer-info.php"
            var i = Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(koolUrl))
            startActivity(i)
        }

        txt_paneer.setOnClickListener {

            Toast.makeText(applicationContext, "180 Rs", Toast.LENGTH_SHORT).show()
        }
    }
}