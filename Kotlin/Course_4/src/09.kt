import java.util.Scanner

fun main() {

   // val scanner = Scanner(System.`in`)
    val obj = Calc()
    println(obj.add(2,8))
    println(obj.sub(2,8))
    println(obj.mul(2,8))
    println(obj.div(2,8))
    val obj2 = Calc().Temp()
    

}


class Calc{
    fun add(a:Int,b:Int):Int = a+b
    fun sub(a:Int,b:Int):Int = a-b
    fun mul(a:Int,b:Int):Int = a*b
    fun div(a:Int,b:Int):Int = a/b
    val c : Int? = null

    inner class Temp()
}