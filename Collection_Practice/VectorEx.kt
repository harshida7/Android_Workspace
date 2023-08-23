import java.util.Vector

fun main()
{
    //its store data on given capacity, if any case user put data more than given capacity
    // its automatically doubles the capacity of vactor,
    // its mostly used when you dont know database capacity and not know th retrive data from user

    var v1 = Vector<String>(5)


    v1.add("a")
    v1.add("b")
    v1.add("c")
    v1.add("d")
    v1.add("e")

    println(v1)
    println(v1.size)
    println(v1.firstElement())
    println(v1.lastElement())
    println(v1.capacity())




    if (v1.contains("e"))
    {
        println("Contains")
    }
    else
    {
        println("Not Available")
    }
}
