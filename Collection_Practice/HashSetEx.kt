import java.util.HashSet


fun main()
{

    // Hash set has no Order maintain in output  because it gives output based on hash code format
    // so output sequance are not maintain
    //set does not allow duplicate values, when you enter duplicate values its return one value both of them
    
    var h1 = HashSet<Int>()

    h1.add(10)
    h1.add(17)
    h1.add(25)
    h1.add(16)
    h1.add(8)

    var h2=HashSet<Char>()

    h2.add('H')
    h2.add('A')
    h2.add('D')
    h2.add('M')
    h2.add('N')


    var i : Iterator<Char> = h2.iterator()

    while(i.hasNext())
    {
        println(i.next())

    }
}