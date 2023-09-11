package com.example.task2_linearlayoutscreens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.inputmethod.InputBinding
import android.widget.Button
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.EditText
import android.widget.Toast
import com.example.task2_linearlayoutscreens.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    /*lateinit var edt1 : EditText
    lateinit var edt2 : EditText
    lateinit var btn1 : Button
    lateinit var chk1:CheckBox*/

  private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        var nm = binding.edt1.text.toString()
        var pass =binding. edt2.text.toString()

        binding.btn1.setOnClickListener {

            var name = binding.edt1.text.toString()
            var pass = binding.edt2.text.toString()

            if (name.length == 0 && pass.length == 0) {
                binding.edt2.setError("Please Enter Password")
            }


            else if (name.length == 0)
            {
                binding.edt1.setError("Please Enter Name")
            }

            else if (pass.length == 0)
            {
                binding.edt2.setError("Please Enter Password")
            }
            else
            {
                if (name == "Cafe" && pass == "12345")
                {
                    var i1 = Intent(applicationContext, MainActivity2::class.java)
                    startActivity(i1)
                } else {
                    Toast.makeText(applicationContext, "Wrong Details", Toast.LENGTH_SHORT).show()
                }
            }
        }
        binding.chk1.setOnClickListener {
                if (binding.chk1.isChecked) {
                    binding. edt2.inputType = 1


                } else {
                    binding.edt2.inputType =
                        InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                }
            }

        }


    }





