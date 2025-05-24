fun main() {
    println(sub(244, 145))
    add1()
    add2(87,54)
    add3()
}

fun sub(a: Int , b: Int): Int{
    val sub = a-b
    return sub
}

fun add1(){
    val a = 10
    val b = 20
    val sum = a+b
    println(sum)
}

fun add2(a: Int , b: Int){
    println(a+b)
}

fun add3(): Int{
    var a = 45
    var b = 15
    return a+b
}