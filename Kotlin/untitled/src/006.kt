fun main() {

    println("Enter Marks : ")
    val marks = readln().toInt()

//    if (marks in 91..100)
//    {
//        println("Grade A")
//    }
//    else if (marks in 81..90) {
//        println("Grade B")
//    }
//    else if (marks in 71..80) {
//        println("Grade C")
//    } else {
//        println("Fail ")
//    }

    val grade:Char = when(marks) {
        in 91..100 -> 'A'
        in 81..90 -> 'B'
        in 71..80 -> 'C'
        else -> 'F'

    }

    println("Grade is $grade ")

}