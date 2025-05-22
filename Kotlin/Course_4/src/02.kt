import java.util.Scanner
import kotlin.math.floor

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter the value of Number : ")
    val number = scanner.nextFloat()
    println(number)

    val isRaining = false

    if (isRaining){
        println("Take an umbrella")
    } else{
        println("You don't need an umbrella")
    }

    println("Now you can go outside ")

}