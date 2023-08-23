import java.util.LinkedList

fun main()
{
    //in linkedlist you can enter value from both side start and end side, so it has two subtypes
    //(i), singly linked list, (ii) doubly linked list

    var a1=LinkedList<String>()

    a1.add("Android")
    a1.add("Java")
    a1.add("Php")
    a1.add("Dart")
    a1.addFirst("First")
    a1.addLast("Last")

    //println(a1)


    var i:Iterator<String> = a1.iterator()

    while (i.hasNext())
    {
        println(i.next())
    }

}