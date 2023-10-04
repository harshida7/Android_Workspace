package com.example.task_3_10_23

import android.app.DatePickerDialog
import android.app.Dialog
import android.app.TimePickerDialog
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.Button
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.DatePicker
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TimePicker
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import java.lang.StringBuilder
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    lateinit var edtFnm: EditText
    lateinit var edtLnm: EditText
    lateinit var edtEmail: EditText
    lateinit var edtPass: EditText
    lateinit var edtCPass: EditText
    lateinit var radGender: RadioGroup
    lateinit var radMale: RadioButton
    lateinit var radFemale: RadioButton
    lateinit var chkHobby1 :CheckBox
    lateinit var chkHobby2 :CheckBox
    lateinit var chkHobby3 :CheckBox

   companion object {
       lateinit var edtDOB: EditText
       lateinit var edtTime: EditText
   }

    lateinit var sharedPreferences: SharedPreferences

    lateinit var btnSubmit : Button
    lateinit var btnFragment: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtFnm = findViewById(R.id.edtFName)
        edtLnm = findViewById(R.id.edtLName)
        edtEmail = findViewById(R.id.edtEmail)
        edtPass = findViewById(R.id.edtPass)
        edtCPass = findViewById(R.id.edtCPass)
        radGender = findViewById(R.id.rg1)
        radFemale = findViewById(R.id.radioFemale)
        radMale = findViewById(R.id.radioMale)
        chkHobby1 = findViewById(R.id.chkHobby1)
        chkHobby2 = findViewById(R.id.chkHobby2)
        chkHobby3 = findViewById(R.id.chkHobby3)
        edtDOB= findViewById(R.id.edtDob)
        edtTime= findViewById(R.id.edtTime)

        btnSubmit = findViewById(R.id.btnSubmit)
        btnFragment = findViewById(R.id.btnFragment)

        sharedPreferences = getSharedPreferences("USER_SESSION", Context.MODE_PRIVATE)



        btnSubmit.setOnClickListener {

            var fnm = edtFnm.text.toString()
            var lnm = edtLnm.text.toString()
            var email = edtEmail.text.toString()
            var pass = edtPass.text.toString()
            var cpass = edtCPass.text.toString()
            var genderM = radMale.text.toString()
            var genderF = radFemale.text.toString()
            var dob = edtDOB.text.toString()
            var time = edtTime.text.toString()

            var builder = StringBuilder ()
            var editor:SharedPreferences.Editor = sharedPreferences.edit()

            if(radMale.isChecked)
            {
                editor.putString("gender",genderM)

            }
            else if(radFemale.isChecked)
            {
                editor.putString("gender",genderF)
            }

            if(chkHobby1.isChecked){
            builder.append("\n Playing Table Tennis")
            }
            if(chkHobby2.isChecked){
                builder.append("\n Playing Cricket")

            }
            if(chkHobby3.isChecked){
                builder.append("\n Playing Basketballs")


            }


            editor.putBoolean("USER_SESSION",true)
            editor.putString("fnm",fnm)
            editor.putString("lnm",lnm)
            editor.putString("email",email)
            editor.putString("pass",pass)
            editor.putString("cpass",cpass)
            editor.putString("hobby",builder.toString())
            editor.putString("dob", dob)
            editor.putString("time", time)


            editor.commit()


            startActivity(Intent(applicationContext,ViewSubmitData::class.java))
        }

        edtDOB.setOnClickListener {
            var d1= MyDatePicker()
            d1.show(supportFragmentManager,"Select Date")


        }

        edtTime.setOnClickListener {
            var d1= MyTimePicker()
            d1.show(supportFragmentManager,"Select Time")

        }
    }


    class MyDatePicker :DialogFragment(), DatePickerDialog.OnDateSetListener {

        override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

            var c = Calendar.getInstance()
            var date = c.get(Calendar.DAY_OF_MONTH)
            var month = c.get(Calendar.MONTH)
            var year = c.get(Calendar.YEAR)

            return DatePickerDialog(requireActivity(), this, year, month, date)
        }

        override fun onDateSet(p0: DatePicker?, p1: Int, p2: Int, p3: Int) {
           MainActivity.edtDOB.setText(StringBuilder()
                .append(p3).append("/").append(p2+1).append("/")
                .append(p1).append(""))
        }
    }

    class MyTimePicker :DialogFragment(), TimePickerDialog.OnTimeSetListener {

        override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

            var c = Calendar.getInstance()
            var hour = c.get(Calendar.HOUR_OF_DAY)
            var minute = c.get(Calendar.MINUTE)


            return TimePickerDialog(requireActivity(), this, hour, minute,true)
        }

        override fun onTimeSet(p0: TimePicker?, p1: Int, p2: Int) {
            MainActivity.edtTime.setText("$p1:$p2")
        }


    }
}

