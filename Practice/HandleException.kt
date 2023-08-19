import java.lang.Exception

fun main ()
{
            try
            {
                    var data = 10/0
                    println(data)
            }
            catch (e:Exception)
            {
                println(e)
            }

    finally
    {
    // this block will execute compulsory
    println("Executed")
    }


}