package com.example.fragmenttofragment

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class Fragment_ViewData : Fragment() {

    private var inputText: String? = ""
    lateinit var textView: TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = layoutInflater.inflate(R.layout.fragment__view_data, container, false)

            textView = view.findViewById(R.id.txtShowDataFragemnt)


        textView.append("\n\n Your First Name: \n"+ arguments?.getString("input_txt1"))
        textView.append("\n\n Your Last Name: \n"+ arguments?.getString("input_txt2"))
        textView.append("\n\n Your Birthdate: \n"+ arguments?.getString("input_txt3"))
        textView.append("\n\n Your Gender: \n"+ arguments?.getString("input_txt4"))
        textView.append("\n\n Your Hobbies: \n"+ arguments?.getString("input_txt5"))
        textView.append("\n\n Your Email: \n"+ arguments?.getString("input_txt6"))
        textView.append("\n\n Your Password: \n"+ arguments?.getString("input_txt7"))


        return view
    }
}