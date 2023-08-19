import java.io.FileOutputStream

fun main()
{
    println("Enter Your Id")
    var id = readLine()

    println("Enter Your Name")
    var nm = readLine()

    println("Enter Your Designation")
    var desig = readLine()

    var i = "\n Your Id Is: "
    var n = "\n Your Name Is: "
    var d = "\n Your Designation Is: "

   var f1= FileOutputStream("D://Data.txt")

    f1.write(i.toByteArray())
    f1.write(id!!.toByteArray())

    f1.write (n.toByteArray())
    f1.write(nm!!.toByteArray())

    f1.write(d.toByteArray())
    f1.write(desig!!.toByteArray())


}