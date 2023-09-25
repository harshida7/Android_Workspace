package com.example.whatsapptablayoutdemo

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.Toast

class CallFragment : Fragment() {
    lateinit var listView: ListView
    lateinit var listC:MutableList<ModelCall>

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        // Inflate the layout for this fragment

        var view = inflater.inflate(R.layout.fragment_call, container, false)

        listView = view.findViewById(R.id.listCall)
        listC = ArrayList()

        listC.add(ModelCall(R.drawable.a,"MAHADEV","Yesterday",R.drawable.audio))
        listC.add(ModelCall(R.drawable.a,"MAHADEV","Yesterday",R.drawable.video))
        listC.add(ModelCall(R.drawable.a,"MAHADEV","Yesterday",R.drawable.audio))
        listC.add(ModelCall(R.drawable.a,"MAHADEV","Yesterday",R.drawable.video))
        listC.add(ModelCall(R.drawable.a,"MAHADEV","Yesterday",R.drawable.audio))




        var myAdapter = MyAdapter3(requireActivity(),listC)
        listView.adapter=myAdapter

        listView.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(requireActivity(),""+position, Toast.LENGTH_LONG).show()

        }

        return view
    }


}
