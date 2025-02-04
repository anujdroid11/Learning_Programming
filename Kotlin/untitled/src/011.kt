// Operators in Kotlin

fun main() {

    // Assignment Operators
    var name = "Google Tech "
    name = "Amar Tech Pvt. Ltd. "


    // Arithmetic Operators
    val x = 50
    val y = 5

    println(x+y)
    println(x-y)
    println(x*y)
    println(x/y)
    println(x%y)

    var temp=50
    val inc = temp.inc()
    println("Increment : "+inc)

    println(x.plus(y))
    println(x.minus(y))

    // Comparison Operators
    var dabba1 = 50
    var dabba2 = 45

    println(dabba1 == dabba2)
    println(dabba1 >= dabba2)
    println(dabba1 <= dabba2)

    // Logical Operators

    val match1 = 101
    val match2 = 99

    if (match1>50 && match2>60) {
        println("I will give bike ")
    } else {
        println("You will get nothing ")
    }
}