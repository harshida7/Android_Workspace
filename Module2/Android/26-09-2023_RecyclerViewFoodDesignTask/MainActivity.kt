package com.example.recyclerviewfoodrecpiedesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.daimajia.slider.library.SliderLayout
import com.daimajia.slider.library.SliderTypes.TextSliderView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var sliderLayout: SliderLayout
    lateinit var list:MutableList<Model>
    var map = HashMap<String,Int>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.foodRecycle)
        sliderLayout = findViewById(R.id.foodSlider)
        list = ArrayList()

        var manager : RecyclerView.LayoutManager = GridLayoutManager(this,2)
        recyclerView.layoutManager=manager

        list.add(Model(R.drawable.burger,"Burger"))
        list.add(Model(R.drawable.pizza,"Pizza"))
        list.add(Model(R.drawable.pasta,"Pasta"))
        list.add(Model(R.drawable.franky,"Franky"))

        var myAdapter = MyFoodAdapter(applicationContext,list)
        recyclerView.adapter=myAdapter


        map.put("pizza",R.drawable.pizza)
        map.put("burger",R.drawable.burger)
        map.put("pasta",R.drawable.pasta)
        map.put("franky",R.drawable.franky)
        map.put("salad",R.drawable.salad)

        for(i in map.keys)
        {
            var textslider = TextSliderView(this)
            textslider.description(i)
            textslider.image(map.get(i)!!)
            sliderLayout.addSlider(textslider)
        }
        sliderLayout.setPresetTransformer(SliderLayout.Transformer.ZoomIn)

    }
}