package com.example.whatsapptablayoutdemo

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.Toast


class StatusFragment : Fragment()
{
    lateinit var listView: ListView
    lateinit var listS:MutableList<ModelStatus>

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        // Inflate the layout for this fragment

        var view = inflater.inflate(R.layout.fragment_status, container, false)

        listView = view.findViewById(R.id.listStatus)
        listS = ArrayList()

      listS.add(ModelStatus(R.drawable.a,"MAHADEV","Yesterday"))
      listS.add(ModelStatus(R.drawable.a,"MAHADEV","Yesterday"))
      listS.add(ModelStatus(R.drawable.a,"MAHADEV","Yesterday"))
      listS.add(ModelStatus(R.drawable.a,"MAHADEV","Yesterday"))
      listS.add(ModelStatus(R.drawable.a,"MAHADEV","Yesterday"))
      listS.add(ModelStatus(R.drawable.a,"MAHADEV","Yesterday"))
      listS.add(ModelStatus(R.drawable.a,"MAHADEV","Yesterday"))
      listS.add(ModelStatus(R.drawable.a,"MAHADEV","Yesterday"))
      listS.add(ModelStatus(R.drawable.a,"MAHADEV","Yesterday"))
      listS.add(ModelStatus(R.drawable.a,"MAHADEV","Yesterday"))
      listS.add(ModelStatus(R.drawable.a,"MAHADEV","Yesterday"))
      listS.add(ModelStatus(R.drawable.a,"MAHADEV","Yesterday"))
      listS.add(ModelStatus(R.drawable.a,"MAHADEV","Yesterday"))
      listS.add(ModelStatus(R.drawable.a,"MAHADEV","Yesterday"))



        var myAdapter = MyAdapterStatus(requireActivity(),listS)
        listView.adapter=myAdapter

        listView.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(requireActivity(),""+position,Toast.LENGTH_LONG).show()


        }

        return view
    }


}
