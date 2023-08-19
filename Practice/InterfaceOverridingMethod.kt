interface P
{
    fun p()

}
interface Q
{
    fun q()
}
class R2 : P,Q
{
    fun r1()
    {
        println("In Class")
    }

    override fun p() {

        println("P Accessed")
    }

    override fun q() {

        println("Q Accessed")
    }

}
fun main()
{
    var r2 = R2()
    r2.p()
    r2.q()
    
}
