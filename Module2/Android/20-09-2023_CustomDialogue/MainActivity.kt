package com.example.customdialogtoast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintSet.Layout

class MainActivity : AppCompatActivity() {
    lateinit var btn1:Button
    lateinit var btn2:Button
    lateinit var btn3:Button
    lateinit var btn4:Button
    lateinit var btn5:Button
    lateinit var btn6:Button
    lateinit var btn7:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1    = findViewById(R.id.btn1)
        btn2    = findViewById(R.id.btn2)
        btn3    = findViewById(R.id.btn3)
        btn4    = findViewById(R.id.btn4)
        btn5    = findViewById(R.id.btn5)
        btn6    = findViewById(R.id.btn6)
        btn7   = findViewById(R.id.btn7)




        btn1.setOnClickListener {

            var toast = Toast(applicationContext)
            var layout = LayoutInflater.from(applicationContext)
            var view = layout.inflate(R.layout.design_toast,null)
            toast.view = view

            toast.setGravity(Gravity.CENTER, 0,0)
            toast.duration= Toast.LENGTH_LONG
            toast.show()

        }

        btn2.setOnClickListener {

            var aleratdialogue = AlertDialog.Builder(this)
            var layout = LayoutInflater.from(applicationContext)
            var view = layout.inflate(R.layout.design_dialogue,null)

            var btn1:Button = view.findViewById(R.id.btnCancel)
            var btn2:Button = view.findViewById(R.id.btnOk)


            btn2.setOnClickListener {

                var i =Intent(applicationContext,MainActivity2::class.java)
                startActivity(i)
            }

            btn1.setOnClickListener {
                finishAffinity()

            }

            aleratdialogue.setView(view)
            aleratdialogue.show()


        }

        btn3.setOnClickListener {

            var aleratdialogue = AlertDialog.Builder(this,R.style.MyDialogStyle)
            var layout = LayoutInflater.from(applicationContext)
            var view = layout.inflate(R.layout.design_dialogue_femaleuser,null)

         //   var txt1:TextView = view.findViewById(R.id.txt3)

          /*  txt1.setOnClickListener {

                Toast.makeText(applicationContext, "CLICKED", Toast.LENGTH_SHORT).show()
            }
*/


            aleratdialogue.setView(view)
            aleratdialogue.show()


        }
        btn4.setOnClickListener {

            var aleratdialogue = AlertDialog.Builder(this)
            var layout = LayoutInflater.from(applicationContext)
            var view = layout.inflate(R.layout.design_dialogue_success,null)

            //   var txt1:TextView = view.findViewById(R.id.txt3)

            /*  txt1.setOnClickListener {

                  Toast.makeText(applicationContext, "CLICKED", Toast.LENGTH_SHORT).show()
              }
  */


            aleratdialogue.setView(view)
            aleratdialogue.show()


        }
        btn5.setOnClickListener {

            var aleratdialogue = AlertDialog.Builder(this)
            var layout = LayoutInflater.from(applicationContext)
            var view = layout.inflate(R.layout.design_dialogue_happyface,null)

            aleratdialogue.setView(view)
            aleratdialogue.show()


        }
        btn6.setOnClickListener {

            var aleratdialogue = AlertDialog.Builder(this)
            var layout = LayoutInflater.from(applicationContext)
            var view = layout.inflate(R.layout.design_dialogue_sadface,null)

            aleratdialogue.setView(view)
            aleratdialogue.show()


        }

        btn7.setOnClickListener {

            var aleratdialogue = AlertDialog.Builder(this,R.style.MyDialogStyle)
            var layout = LayoutInflater.from(applicationContext)
            var view = layout.inflate(R.layout.design_dialogue_location,null)
            aleratdialogue.setView(view)
            aleratdialogue.show()


        }
    }
}


