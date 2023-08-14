//left to right, top to bottom
fun main()
{
    for(i in 1..5)//row
    {
        for(j in 1..i)//col
        {	
            if(j <= i)
            print(" " + i*i)

        }
        print("\n")
    }


}