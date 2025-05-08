package Oldfiles

fun main() {

    println("Enter Number 1 = ")
    var num1 = readln().toInt()

    println("Enter Number 2 = ")
    var num2 = readln().toInt()

    var temp = num1

    num1 = num2
    num2 = temp

    println("Number1 : $num1, Number2 : $num2")

}