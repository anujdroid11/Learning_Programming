fun main() {
    val c = addWithDefaults(b = 12)
    println(c)

    val d = add1(10,10);
    println(d);

}

fun addWithDefaults(a: Int = 20, b: Int = 14): Int {
    val sum = a + b
    return sum
}

fun add1(a: Int, b: Int): Int{
    return a+b;
}