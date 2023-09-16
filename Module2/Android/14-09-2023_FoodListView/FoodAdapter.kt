package com.example.customlisttaskfood

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageView
import android.widget.TextView



class FoodAdapter (var context: Context, var listFood:MutableList<Model>) : BaseAdapter(), Filterable {
    override fun getCount(): Int {
        return listFood.size
    }

    override fun getItem(p0: Int): Any {

        return listFood.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var layoutInflater = LayoutInflater.from(context)
        var view = layoutInflater.inflate(R.layout.design, p2, false)

        var image: ImageView = view.findViewById(R.id.img1)
        var txt1: TextView = view.findViewById(R.id.txtname)
        var txt2: TextView = view.findViewById(R.id.txtnum)


        image.setImageResource(listFood.get(p0).image)
        txt1.setText(listFood.get(p0).foodNm)
        txt2.setText(listFood.get(p0).time)

        return view
    }

    override fun getFilter(): Filter {
        TODO("Not yet implemented")
    }


}




