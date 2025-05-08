package New

import java.util.Scanner

fun main() {

    val a = 45
    var b = 54
    println("Enter Your Choice : ")
    val choice = Scanner(System.`in`).nextInt()
    if (choice==1) {
        println(a+b)
    } else if (choice == 3) {
        println(a * b)
    } else {
        println(a / b)
    }

    when (choice) {
        1->{

        }
        else -> ""
    }
}