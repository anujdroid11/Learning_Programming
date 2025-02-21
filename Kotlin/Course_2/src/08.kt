fun main() {

    square()

    val num = 1
    if (num.toCusBoolean()) {
        println("Num is even")
    } else {
        println("Num is odd")
    }

}

fun Int.toCusBoolean(): Boolean {
    if (this==1) {
        return true
    } else {
        return false
    }
}




fun square() {

    var number = 23

    println(number.times(number))
}