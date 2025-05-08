package Oldfiles

fun main() {
    val favoriteNumbers = intArrayOf(1,2,3,4,5,69)
    val helloWorld = "Hello World! "

    val evenNumbers = favoriteNumbers.filter { it % 2 == 0 }
    val lettersOnly = helloWorld.filter { it.isLetter() }

    val stringsList = listOf(
        "Hello World",
        "Hello World 2",
        "Hello World 4"
    )

    val integers = listOf(1, 2, 3, 4, 5)

    val filteredStrings = stringsList.myFilter { currentString ->
        currentString.length > 10
    }

    val filteredNumbers = integers.myFilter { it < 3 }

    println(filteredStrings)
    println(filteredNumbers)

}

fun <T> List<T>.myFilter(predicate: (T) -> Boolean): List<T> {
    val result = mutableListOf<T>()
    for (element in this) {
        if (predicate(element)) {
            result.add(element)
        }
    }
    return result.toList()
}