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

class   MyAdapterStatus(private val context: Context, private val itemList: List<ModelStatus>) : BaseAdapter()
{

    val fileteredlist = ArrayList<ModelStatus>()

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
        var view = convertView ?: LayoutInflater.from(context).inflate(R.layout.design_status, parent, false)

        var image:CircleImageView = view.findViewById(R.id.SProfile_Image)
        var txt1:TextView = view.findViewById(R.id.txtSname)
        var txt2:TextView = view.findViewById(R.id.txtSnum)


        image.setImageResource(itemList.get(position).image)
        txt1.setText(itemList.get(position).name)
        txt2.setText(itemList.get(position).st)

        val item = fileteredlist[position]
        txt1.text = item.name
        return view
    }
}

