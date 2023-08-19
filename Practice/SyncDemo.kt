class Sender
{
    fun send(msg:String)
    {
        println("$msg Sending")
        Thread.sleep(1000)
        println("$msg Sent")
    }
}

class ThreadSend (var sender: Sender, var msg: String) : Thread()
{
    override fun run()
    {
        synchronized(sender)
        {
            sender.send(msg)
        }
        super.run()
    }
}

fun main()
{

        var sender = Sender()

    var t1= ThreadSend(sender, "Hii")
    var t2= ThreadSend(sender,"Bye")

    t1.start()
    t2.start()

}