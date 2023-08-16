fun main()
{

    println("Enter Dividend")
    var dividend:Int = readLine()!!.toInt()

    println("Enter Divisor")
    var divisor:Int = readLine()!!.toInt()

    var quotient = dividend / divisor
    var reminder = dividend % divisor


    println("Quotient is $quotient")
    println("Reminder is $reminder")


}