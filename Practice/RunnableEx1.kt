class T3 : Runnable
{
    override fun run()
    {
        for (i in 1..10)
        {
            println("Runnable T3 : $i")
        }
    }
}

class T4 : Runnable
{
    override fun run()
    {
        for(i in 1..10)
        {
            println("Runnable T4 is : $i")
        }
    }

}

fun main()
{
        var t3= Thread(T3())
        var t4= Thread(T4())

    t3.run()
    t4.run()

}