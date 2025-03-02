fun main() {
    val c1 = add(20, 25)
    val c2 = add(20)
    println(c1)
    println(c2)
}

fun add(a: Int, b: Int? = null): Int {
    if(b == null){
        return a + 15;
    } else {
        return a + b;
    }
}