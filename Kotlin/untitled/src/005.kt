fun main() {
    println("Enter number : ")
    val number:Int = readln().toInt()

//    if (number>0)
//    {
//        println("Number is positive ")
//    } else
//    {
//        println("Number is negative ")
//    }

/*   if (number>0) {
       println("Number is positive ")
   } else if (number < 0 ) {
       println("Number is negative ")
   } else {
       println("number is 0 ")
   }
*/

    println("Enter first number : ")
    val number1 = readln().toInt()
    println("Enter second number: ")
    val number2 = readln().toInt()

//    if (number1>number2) {
//        println("Number $number1 is max ")
//    } else {
//        println("Number $number2 is max ")
//    }

    val max = if ( number1 > number2) {
        number1
    } else {
        number2
    }

    println("Number $max is maximum ")




}