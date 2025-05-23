import java.util.Scanner

fun main() {

    println("Enter a number between 1 to 7")
    var day = Scanner(System.`in`).nextInt()

   when(day){
       1 -> {
           println("Monday")
       }
       2 -> {
           println("Tuesday")
       }
       3 -> {
           println("Wednesday")
       }
       4 -> {
           println("Thursday")
       }
       5 -> {
           println("Friday")
       }
       6 -> {
           println("Saturday")
       }
       7 -> {
           println("Sunday")
       }
       else -> {
           println("Invalid Day")
       }
   }

    val result = when(day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        else -> "Invalid Day "
    }
    println(result)

    val name = "Anuj"
    var name2 : String? = null

    println(name.length)
    // println(name2.length)
    if (name2 == null){
        println("Variable is null")
    }else {
        println(name2.length)
    }

    println(name2?.length)
    // println(name2!!.length)

    name2?.let { myName ->

        println(myName.length)

    }


}

