open class Bank()
{
    fun bank()
    {
        println("Banking")
    }
}

class Current() : Bank()
{
    fun current()
    {
        println("Current")
    }
}

class Save() : Bank()
{
    fun save()
    {
        println("Saving")
    }
}

fun main(args: Array<String>) {

    var c1= Current()
    var s1= Save()

    c1.bank()
    s1.save()
    c1.current()



}