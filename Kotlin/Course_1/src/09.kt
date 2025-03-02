import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter Marks for Subject 1 ")
    val marks1 = scanner.nextInt()
    println("Enter Marks for Subject 2 ")
    val marks2 = scanner.nextInt()
    println("Enter Marks for Subject 3 ")
    val marks3 = scanner.nextInt()
    println("Enter Marks for Subject 4 ")
    val marks4 = scanner.nextInt()
    println("Enetr Marks for Subject 5 ")
    val marks5 = scanner.nextInt()

    if (marks1 > 40 && marks2 >
        40 && marks3 > 40 &&
        marks4 > 40 && marks5 > 40
    ) {
        println("Pass")
    } else {
        println("Fail")
    }
}