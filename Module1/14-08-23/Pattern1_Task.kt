fun main()
{
    for(i in 1..5)//row
    {
        var cnt = i
        
        for(space in 0..(5-i))
        {
        print(" ")
        }
        
        for(j in 1..i)
        {                  
            
            print ("$cnt")
                cnt = cnt - 1
        }
        
        
        println()
       
    }

}