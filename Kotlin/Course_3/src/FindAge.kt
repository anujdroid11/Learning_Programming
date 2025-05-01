import java.util.Calendar

fun main() {

    println("Enter Year of Birth : ")
    val yearOfBirth = readln().toInt()
    val yearInDevice = Calendar.getInstance().get(Calendar.YEAR)
    val age = yearInDevice - yearOfBirth

    println("You are $age years old")
}