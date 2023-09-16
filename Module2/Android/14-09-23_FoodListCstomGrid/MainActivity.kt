package com.example.customgridview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.widget.SearchView

class MainActivity : AppCompatActivity() {
    lateinit var gridView: GridView
    lateinit var list:MutableList<Model>
    lateinit var s1:SearchView


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.g1)
        list = ArrayList()
        s1 = findViewById(R.id.s1)

        list.add(Model(R.drawable.maggie,"Maggie","10 mins","\n Maggie Noodle"+"\n Water" + "\n Maggie Masala" ,"\n Add 1 cup of water"+
                  "\n add maggie noodles and boiled it" +
                "\n add maggi masala"+ "\n Wait for 2 mins" + "\n Yay! Maggi Is Ready"))
        list.add(Model(R.drawable.bdaycake,"Birthday Cake","30 mins","1 cup white sugar\n" +
               "\n½ cup unsalted butter\n" +
                "\n2 large eggs\n" +
                "\n2 teaspoons vanilla extract\n" +
                "\n1 ½ cups all-purpose flour\n" +
                "\n1 ¾ teaspoons baking powder\n" +
               "\n½ cup milk","Gather all ingredients.\n" +
               "\n½Preheat the oven to 350 degrees. Grease and flour a 9-inch square cake pan.\n" +
                "\nCream sugar and butter together in a mixing bowl. " +
                "\nAdd eggs, one at a time, beating briefly after each addition." +
                "\nMix in vanilla.\n" +
                "\nCombine flour and baking powder in a separate bowl. Add to the wet ingredients and mix well. " +
                "\nAdd milk and stir until smooth.\n" +
                "\nBake in the preheated oven until the top springs back when lightly touched, 30 to 40 minutes.\n" +
               "\nRemove from the oven and cool completely.\n" + "Enjoy!!\n\n\n\n"))

        list.add(Model(R.drawable.pasta,"Pasta","20 mins","\n Pasta Noodle"+"\n Water & Veggies You Like" + "\n Pasta Masala",
            "\n Add 1 cup of water" + "\n add Hakka noodles and boiled it"  +
                "\n add maggie noodles and boiled it" + "\n Add Veggies" + "\n Sauted And Mix Well" + "\n Add Boiled Noodles" + "\n Cooked For 5 Min" + "\n Let's Enjoy"))

        list.add(Model(R.drawable.pizza,"Pizza","35 mins","\n Pizza Base" + "\n Vegetables Of your Choice"
            +"\n Mozarella Cheese" +"\n Pizza Spread"+ "\n Chilli Flakes"+"\n Oragano" ,"Take One Regular Sized Pizza Base\n" +
                "Spread The Pizza Sauce\n" +
                "Add All Chopped Favourite Veggies\n" +
                "Spread Mozerella Cheese\n" +
                "Put It In Oven For 20mins\n" +
                "Yay! Enjoy Your Pizza!"))

        list.add(Model(R.drawable.pancakes,"Pen Cakes","20 mins","All Purpose Flour\n" +
                "\n" +
                "Sugar\n" +
                "\n" +
                "Backing Powder\n" +
                "\n" +
                "Salt\n" +
                "\n" +
                "Milk & Oil","Combine the dry ingredients.\n" +
                "\n" +
                "Add the wet ingredients and mix. \n" +
                "\n" +
                "Pour or ladle the batter onto the oiled griddle or pan. \n" +
                "\n" +
                "Cook until bubbles form, flip, and cook on the other side.\n\n\n\n"))

        list.add(Model(R.drawable.fries,"Fries","10 mins","\n Potatoes\n" + "\n Oil\n" + "\n Salt\n",
            "\n Take A Pan" + "Put Oil On It and Boiled\n" + "\n Chopped Potatoes\n"+" \n Put Chopped Potatoes In Oil\n"
        +"\n Cook Until Chips Turns Into Brown Color And Crispy\n" + "\n Now serve In Bowl And Sprinkle Some Salt For Taste\n"+ "\nEnjoy\n"))

        var myAdapter = FoodAdapter(applicationContext,list)
        gridView.adapter = myAdapter


        gridView.setOnItemClickListener { parent, view, position, id ->
            var i = Intent(applicationContext,FoodDetails::class.java)
            i.putExtra("pos",position)
            i.putExtra("name",list.get(position).title)
            i.putExtra("num",list.get(position).time)
            i.putExtra("image",list.get(position).image)
            i.putExtra("method",list.get(position).ingredients)
            i.putExtra("steps",list.get(position).receipe)
            startActivity(i)
        }


        s1.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
              return false
                Toast.makeText(applicationContext, "true", Toast.LENGTH_SHORT).show()
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                TODO("Not yet implemented")
            }


        })

    }

}



