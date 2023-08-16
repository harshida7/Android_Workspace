fun main()
{


    var str = "Kotlin Is Awesome"
     val ch = 'i'
    var freq = 0

    for(i in 0..str.length-1)
    {
        if(ch == str[i])
        {
            ++freq
        }
    }

    println("Frequency of $ch is $freq")
}