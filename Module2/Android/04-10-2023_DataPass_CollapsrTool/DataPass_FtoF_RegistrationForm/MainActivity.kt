package com.example.fragmenttofragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity(), Communicator {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Replace Main Activity content with the Fragment1 content
        val fragment1 = Fragment_Data()
        supportFragmentManager.beginTransaction().replace(R.id.frmId1, fragment1).commit()

    }

    override fun passDataCom(editFnm: String, editLnm: String, email: String, edtDob: String, gender:String, hobby:String, pass:String ) {
        val bundle = Bundle()
        bundle.putString("input_txt1", editFnm)
        bundle.putString("input_txt2", editLnm)
        bundle.putString("input_txt3", email)
        bundle.putString("input_txt4", edtDob)
        bundle.putString("input_txt5", gender)
        bundle.putString("input_txt6", hobby)
        bundle.putString("input_txt7", pass)


        val transaction = this.supportFragmentManager.beginTransaction()
        val frag2 = Fragment_ViewData()
        frag2.arguments = bundle

        transaction.replace(R.id.frmId1, frag2)
        transaction.addToBackStack(null)
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        transaction.commit()
    }


}