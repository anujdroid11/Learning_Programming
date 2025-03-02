fun main() {
    val obj = Calc()
    println(obj.add(2,7))
    println(obj.sub(2,7))
    println(obj.mul(2,7))
    println(obj.div(2,7))

}

class Calc{
    fun add(a:Int,b:Int):Int= a+b
    fun sub(a:Int,b:Int):Int= a-b
    fun mul(a:Int,b:Int):Int= a*b
    fun div(a:Int,b:Int):Int= a/b
}