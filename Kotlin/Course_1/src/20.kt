import java.lang.System.`in`
import java.util.Scanner

fun main() {
//    val scanner = Scanner(System,`in`)
    val obj = Anuj(5,8)
    println("Addition : ${obj.add()}")
    println("Subtraction : ${obj.add()}")
//    val test = fun(a:Int, b:Int) {}

}

class Anuj(val a:Int , val b:Int){
    fun add(): Int = a+b
    fun sub(): Int = a-b
    fun mul(): Int = a*b
    fun div(): Int = a/b
}

