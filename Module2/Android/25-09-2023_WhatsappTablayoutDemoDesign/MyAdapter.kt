package com.example.whatsapptablayoutdemo

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyAdapter (var context: Context, var fm:FragmentManager) :FragmentStatePagerAdapter(fm)

{
    var listFragment:ArrayList<Fragment> = ArrayList<Fragment>()
    var listTitle:ArrayList<String> = ArrayList<String>()




    override fun getCount(): Int {
     return listFragment.size
    }

    override fun getItem(position: Int): Fragment {
        return listFragment.get(position)
    }

    override fun getPageTitle(position: Int): CharSequence?
    {
        return listTitle.get(position)
    }

    fun MyData(fragment: Fragment, title:String)
    {
        listFragment.add(fragment)
        listTitle.add(title)

    }
}