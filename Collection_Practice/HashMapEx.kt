fun main ()
{
    //its stores values in key value pair, key is not duplicate, value may be contians same data/
    // key must be unique
    //if user add duplicate Key it returns only 1 pair of key and value, replace with second
    // it uses put() method for adding data insted of add

    var has1= HashMap<Int,String>()

    has1.put(1, "Android")
    has1.put(2, "Java")
    has1.put(4, "Php")
    has1.put(4, "Kotlin")

    println(has1)


    for (i in has1.entries)
    {
        println(i)
    }
}