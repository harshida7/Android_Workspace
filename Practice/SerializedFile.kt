import java.io.FileOutputStream
import java.io.ObjectOutputStream
import java.io.Serializable

fun main()
{
        var x1= Serialized_Class_Ex(101,"Honey")
        var fout= FileOutputStream ("D://Serialize.txt")
        var o1 = ObjectOutputStream(fout)
        o1.writeObject(x1)

    println("Success")

}