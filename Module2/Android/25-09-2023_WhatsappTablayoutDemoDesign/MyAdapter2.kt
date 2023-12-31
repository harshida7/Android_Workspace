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

class   MyAdapter2(private val context: Context, private val itemList: List<Model>) : BaseAdapter()
{
    /* private val filteredList = ArrayList<Model>()

     init {
         filteredList.addAll(itemList)
     }*/

    val fileteredlist = ArrayList<Model>()

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
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.design, parent, false)

        var image:CircleImageView = view.findViewById(R.id.Profile_Image)
        var txt1:TextView = view.findViewById(R.id.txtname)
        var txt2:TextView = view.findViewById(R.id.txtnum)
        var txt3:TextView = view.findViewById(R.id.txttime)


        image.setImageResource(itemList.get(position).image)
        txt1.setText(itemList.get(position).name)
        txt2.setText(itemList.get(position).num)
        txt3.setText(itemList.get(position).time)

        val item = fileteredlist[position]
        txt1.text = item.name
        return view
    }




}

