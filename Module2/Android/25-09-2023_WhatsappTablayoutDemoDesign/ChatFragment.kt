package com.example.whatsapptablayoutdemo

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.Toast


class ChatFragment : Fragment()
{
    lateinit var listView: ListView
    lateinit var list:MutableList<Model>

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        // Inflate the layout for this fragment

        var view = inflater.inflate(R.layout.fragment_chat, container, false)

        listView = view.findViewById(R.id.list)
        list = ArrayList()

        list.add(Model(R.drawable.a,"Harshida","TOPS : Training,  Outsourcing,  Placements,  Study Abroad","18:25"))
        list.add(Model(R.drawable.b,"Meet","TOPS : Training,  Outsourcing,  Placements,  Study Abroad","Yesterday"))
        list.add(Model(R.drawable.a,"Pooja","TOPS : Training,  Outsourcing,  Placements,  Study Abroad","15:00"))
        list.add(Model(R.drawable.a,"Jahanvi","TOPS : Training,  Outsourcing,  Placements,  Study Abroad","10:25"))
        list.add(Model(R.drawable.a,"Mansi","TOPS : Training,  Outsourcing,  Placements,  Study Abroad","16:00"))
        list.add(Model(R.drawable.b,"Rudra","TOPS : Training,  Outsourcing,  Placements,  Study Abroad","17:45"))
        list.add(Model(R.drawable.b,"Shiv","TOPS : Training,  Outsourcing,  Placements,  Study Abroad","18:33"))
        list.add(Model(R.drawable.b,"Shankar","TOPS : Training,  Outsourcing,  Placements,  Study Abroad","20:20"))
        list.add(Model(R.drawable.a,"Harshida","TOPS : Training,  Outsourcing,  Placements,  Study Abroad","18:25"))
        list.add(Model(R.drawable.b,"Meet","TOPS : Training,  Outsourcing,  Placements,  Study Abroad","Yesterday"))
        list.add(Model(R.drawable.a,"Pooja","TOPS : Training,  Outsourcing,  Placements,  Study Abroad","15:00"))
        list.add(Model(R.drawable.a,"Jahanvi","TOPS : Training,  Outsourcing,  Placements,  Study Abroad","10:25"))
        list.add(Model(R.drawable.a,"Mansi","TOPS : Training,  Outsourcing,  Placements,  Study Abroad","16:00"))
        list.add(Model(R.drawable.b,"Rudra","TOPS : Training,  Outsourcing,  Placements,  Study Abroad","17:45"))
        list.add(Model(R.drawable.b,"Shiv","TOPS : Training,  Outsourcing,  Placements,  Study Abroad","18:33"))
        list.add(Model(R.drawable.b,"Shankar","TOPS : Training,  Outsourcing,  Placements,  Study Abroad","20:20"))

        var myAdapter = MyAdapter2(requireActivity(),list)
        listView.adapter=myAdapter

        listView.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(requireActivity(),""+position,Toast.LENGTH_LONG).show()


        }

        return view
    }


}