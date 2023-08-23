fun main()
{
    // in arraylist you can only enter value from starting point or 0 index

    var a1=ArrayList<String>()

    a1.add("Harshida")
    a1.add("Hit")
    a1.add("Milan")
    a1.add("Deep")

    //println(a1)

    var a2 = ArrayList<String>()

    a2.add("Java")
    a2.add("Android")
    a2.add("Php")
    a2.add("Deep")

    //a1.addAll(a2)//combine both araylist values a1 and a2

    a1.retainAll(a2)// return same value form both araylist

    var i:Iterator<String> = a1.iterator()

    while (i.hasNext())
    {
        println(i.next())
    }

}