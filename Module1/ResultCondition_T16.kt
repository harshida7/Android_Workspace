fun main()
{

    //percentage > 75 you have to print “Distinction”
    //percentage > 60 and percentage <= 75 you have to print “First class”
    //percentage >50 and percentage <= 60 you have to print “Second class”
    //percentage > 35 and percentage <= 50 you have to print “Pass class”
    //Otherwise print “Fail”

    var sub1= 75
    var sub2= 82
    var sub3= 89
    var sub4= 75
    var sub5= 83

    var max = 500.0

    var total = sub1+sub2+sub3+sub4+sub5

    println("Total :: " + total)

    var per = total / max * 100

    println("percentage :: " + per)

    if(per > 75)
    {
        println("Distinction")
    }
    else if(per > 60 && per <= 75)
    {
        println("First Class")
    }

    else if(per > 50 && per <= 60)
    {
        println("Second Class")
    }

    else if(per > 35 && per <= 50)
    {
        println("Third Class")
    }

    else
    {
        println("Fail")
    }

}