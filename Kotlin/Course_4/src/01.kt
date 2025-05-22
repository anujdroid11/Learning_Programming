fun main() {
    // + , - , * , / , %
    var a = 15
    var b = 4F

    println(a+b)
    println(a-b)
    println(a*b)
    println(a/b)
    println(a%b)

    // -- , ++

    println(--a)
    println(++b)

    // = , += , -=, *= , /= , %=

    a = a+7
    a += 2

    println(a)

    a %= 12
    println(a)

    println(a > b)
    println(a < b)
    println(a <= b)
    println(a >= b)
    println(a.toFloat() == b)
    println(a+4)
    println(a.toFloat() != b)
    println(a.toFloat() === b)

    var c = 547
    var d = 59

    println(true && true)
    println(false || true)
    println(!true)

}