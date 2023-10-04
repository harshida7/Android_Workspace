package com.example.fragmenttofragment


import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.DatePicker
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Calendar


class Fragment_Data : Fragment() {

lateinit var edtFnm:EditText
lateinit var edtLnm:EditText

lateinit var rg: RadioGroup
lateinit var rmale: RadioButton
lateinit var rfemale:RadioButton
lateinit var email:EditText
lateinit var pass:EditText
lateinit var chk1: CheckBox
lateinit var chk2: CheckBox

lateinit var simpleDateFormat: SimpleDateFormat
companion object
{
    lateinit var edtdob:EditText

}

lateinit var btnSubmit:Button

lateinit var comm: Communicator




    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        var view =  inflater.inflate(R.layout.fragment__data, container, false)

        comm = requireActivity() as Communicator
        edtFnm = view.findViewById(R.id.edtFName)
        edtLnm = view.findViewById(R.id.edtLName)
        email = view.findViewById(R.id.edtEmail)
        edtdob = view.findViewById(R.id.edtDob)
        rg = view.findViewById(R.id.rg1)
        rmale = view.findViewById(R.id.radioMale)
        rfemale = view.findViewById(R.id.radioFemale)
        chk1 = view.findViewById(R.id.chk1)
        chk2 = view.findViewById(R.id.chk2)
        pass = view.findViewById(R.id.edtPass)

        btnSubmit = view.findViewById(R.id.btnLog)


        btnSubmit.setOnClickListener {

            comm.passDataCom("\n" + edtFnm.text.toString(),
                "\n" + edtLnm.text.toString(),
                "\n" + edtdob.text.toString(),
                "\n" +  if(rmale.isChecked){rmale.text.toString()}
                else {rfemale.text.toString()},
                "\n" + if(chk1.isChecked){
                    chk1.text.toString()
                }else
                {""} + "\n \n" +
                        if(chk2.isChecked){
                            chk2.text.toString()
                        }else{""},
                "\n"+email.text.toString() ,
                "\n" + pass.text.toString())

        }

        edtdob.setOnClickListener {

            var d1= MyDatePicker()
            d1.show(requireFragmentManager(),"Select Date")
        }
        return  view
    }


    class MyDatePicker : DialogFragment(), DatePickerDialog.OnDateSetListener {

        override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {


            var c = Calendar.getInstance()
            var date = c.get(Calendar.DAY_OF_MONTH)
            var month = c.get(Calendar.MONTH)
            var year = c.get(Calendar.YEAR)



            return DatePickerDialog(requireActivity(), this, year, month, date)

        }

        override fun onDateSet(p0: DatePicker?, p1: Int, p2: Int, p3: Int) {

            edtdob.setText(StringBuilder()
                .append(p3).append("/").append(p2+1).append("/")
                .append(p1).append(""))

        }




    }
}