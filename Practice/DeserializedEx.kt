import java.io.FileInputStream
import java.io.ObjectInputStream


fun main()
{
    var oin= ObjectInputStream (FileInputStream("D://Serialize.txt"))
    var a:Serialized_Class_Ex=oin.readObject() as Serialized_Class_Ex


    print("${a.id} and ${a.nm}")

}