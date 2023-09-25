package com.example.whatsapptablayoutdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    lateinit var toolbar:androidx.appcompat.widget.Toolbar
    lateinit var tabLayout: TabLayout
    lateinit var viewPager:ViewPager



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.tool)
        setSupportActionBar(toolbar)

        viewPager = findViewById(R.id.vp)
        setuppager()

        tabLayout = findViewById(R.id.tab1)
        tabLayout.setupWithViewPager(viewPager)




    }

    fun setuppager()

    {
            var adapter = MyAdapter(applicationContext,supportFragmentManager)
            adapter.MyData(ChatFragment(),"CHAT")
            adapter.MyData(StatusFragment(),"STATUS")
            adapter.MyData(CallFragment(),"CALL")

                viewPager.adapter =adapter

    }
}