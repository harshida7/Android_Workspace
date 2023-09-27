package com.example.listviewdemo

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.SearchView
import android.widget.Toast
import com.example.listviewdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

        private lateinit var binding: ActivityMainBinding
        lateinit var list:MutableList<String>
        lateinit var edt1:EditText
        lateinit var btnAdd:Button
        lateinit var btnDel:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        list = ArrayList()

        list.add("Android")
        list.add("Java")
        list.add("Php")
        list.add("Ios")

        var adapter = ArrayAdapter(applicationContext, R.layout.simple_list_item_1,list)
        binding.list.adapter=adapter



        binding.btnAdd.setOnClickListener {
            var nm = binding.edt1.text.toString()

           if(nm.isNotEmpty())
           {
                list.add(nm)
               adapter.notifyDataSetChanged()
           }
           /* else if(list.contains(nm))
           {
               Toast.makeText(applicationContext, "Vale Already Exist", Toast.LENGTH_SHORT).show()

            }
*/
        }


        binding.btnDel.setOnClickListener {
            var nm = binding.edt1.text.toString()

            if(nm.isNotEmpty())
            {
                list.remove(nm)
                adapter.notifyDataSetChanged()
            }

        }



     /*   binding.search.setOnQueryTextListener(object: SearchView.OnQueryTextListener,
            androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {

                *//*if(list.contains(query))
                {
                    adapter.filter.filter(query)
                }*//*
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean
            {
                    adapter.filter.filter(newText)
                    return false
            }
        })*/
    }
}