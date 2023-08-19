import java.lang.Exception

class MyException() : Exception()
{
    fun printEx()
    {
        println("My Exception")
    }
}

fun main ()
{
    var e1 =   MyException()

    e1.printEx()
}