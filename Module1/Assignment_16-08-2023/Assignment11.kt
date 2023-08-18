fun main (args: Array<String>)
{
        var myMap = HashMap<String, String>()

    myMap.put("Gujarat", "Rajkot")
    myMap.put("Uttar Pradesh", "Delhi")
    myMap.put("Tamilnadu", "Chennai")



    for(key in myMap.keys)
    {
        println("Element at key : $key, ${myMap[key]}")
      //  println(key)
    }

}