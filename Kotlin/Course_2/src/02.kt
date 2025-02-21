fun main() {
    var rahulHeight = 3.5
    var tahirHeight = 5.6

    if (rahulHeight > tahirHeight ) {
        println("Rahul is Taller ")
    } else {
        println("Tahir is Taller ")
    }

    println("How old are you ")
    val age = readLine()!!.toInt()
    println("Your age is $age ")

    if (age < 18 )
        println("You are too young to vote ")
    else if (age < 40)
        println("You can vote and Are You excited for election ")
    else
        println("You can vote now")



}