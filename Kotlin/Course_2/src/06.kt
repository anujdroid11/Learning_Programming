import java.util.Scanner

fun main() {
    val calc = `06`() // Corrected: Create an instance of the class `06`
//    val scanner = Scanner(System.`in`)
//    val number1 = scanner.nextInt() // Corrected
    val result = calc.add(23, 45)
    println(result)
}

class `06` {
    fun add(a: Int, b: Int): Int {
        return a + b
    }
}
