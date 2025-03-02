import java.util.Scanner

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

    if(marks1>40) {
        if (marks2>40){
            if (marks3>40) {
               if (marks4>40) {
                   if (marks5>40) {
                       val finalScore = (marks1 + marks2 + marks3 + marks4 + marks5) / 5.0
                       if (finalScore > 60 ) {
                           println("Pass with $finalScore")
                       } else {
                           println("Fail")
                       }
                   }
               }
            }
        }


    } else {
        println("Fail")
    }


}