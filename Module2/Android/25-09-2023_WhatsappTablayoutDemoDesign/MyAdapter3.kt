package com.example.whatsapptablayoutdemo
import android.content.Context
import android.view.Display.Mode
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import android.widget.BaseAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class   MyAdapter3(private val context: Context, private val itemList: List<ModelCall>) : BaseAdapter()
{


    val fileteredlist = ArrayList<ModelCall>()

    init
    {
        fileteredlist.addAll(itemList)
    }


    override fun getCount(): Int
    {
        return fileteredlist.size
    }

    override fun getItem(position: Int): Any {
        return fileteredlist[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.design_call, parent, false)

        var image:CircleImageView = view.findViewById(R.id.CProfile_Image)
        var txt1:TextView = view.findViewById(R.id.txtCname)
        var txt2:TextView = view.findViewById(R.id.txtCnum)
        var callImg:ImageView = view.findViewById(R.id.callIcon)



        image.setImageResource(itemList.get(position).image)
        txt1.setText(itemList.get(position).name)
        txt2.setText(itemList.get(position).stC)
        callImg.setImageResource(itemList.get(position).callIcon)

        val item = fileteredlist[position]
        txt1.text = item.name
        return view
    }




}

