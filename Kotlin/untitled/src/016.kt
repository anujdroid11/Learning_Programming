

fun sumTwoNumbers(
    number1:Int,
    number2:Int,
    callBack:()->Unit
) {
    println("Sum of two numbers is ${number1 + number2}")
    callBack()
}

fun main() {
    val callBackFunction = {
        println("Sum Completed")
    }
    sumTwoNumbers(number1 = 12, number2 = 34, {
        println("wow this another method to call lamda ")
    })
}