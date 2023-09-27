package com.example.recyclerviewfoodrecpiedesign

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyFoodAdapter(var context: Context, var list: MutableList<Model>):RecyclerView.Adapter<MyFoodView>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyFoodView
    {

        var inflater = LayoutInflater.from(context)
        var view = inflater.inflate(R.layout.designfood,parent,false)
        return MyFoodView(view)

    }
    override fun onBindViewHolder(holder: MyFoodView, position: Int) {
        holder.image.setImageResource(list.get(position).imgFood)
        holder.txt.setText(list.get(position).foodNm)
    }
    override fun getItemCount(): Int
    {
        return list.size
    }


}

class MyFoodView (itemview: View) : RecyclerView.ViewHolder(itemview)
{
    var image:ImageView = itemview.findViewById(R.id.foodImg)
    var txt:TextView = itemview.findViewById(R.id.foodTitle)
}
