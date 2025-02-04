import javax.sound.midi.MetaMessage // This import is not used in the given code and can be removed

fun countDigit1(number: Int): Int {
    var count = 0
    var n = number

    while (n > 0) {
        n /= 10
        count++
    }

    return count
}

fun sayHello1(message: String) {
    println("hello $message")
}

fun main() {
    val resultCount = countDigit(number = 1212)
    println("Number of digits is $resultCount") // Corrected the output message
    sayHello1("World") // Provided an argument for the sayHello function
}