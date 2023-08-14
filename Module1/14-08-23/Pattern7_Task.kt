fun main() {

    for(i in 1..5)
    
    {
        for(j in 1..i)
        
        {
               if ((i + j) % 2 == 0)
            	{
                    print(" 1")
               	}
                else
            {
                print(" 0")
            }
           
        }
        println()
    }
    
}