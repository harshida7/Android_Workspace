open class W()
{
    fun w()
    {
        println("W Print")
    }
}

interface X
{
    fun x()
    {
        println("X Print")
    }
}

open class Y():W()
{
    fun y()
    {
        println("Y Print")
    }
}

class Z(): Y(),X
{
    fun z()
    {
        println("Z Print")
    }
}

fun main(args: Array<String>) {

    var z1= Z()

    z1.w()
    z1.x()
    z1.y()
    z1.z()



}