fun main() {
    val calc = Calc()
    var result = calc.add(23,45)
    println(result)

    val beta = Beta() ; beta.jamapuji

}

class Calc{
    fun add(a: Int, b: Int): Int {
        return a + b
    }
}

open class Pitaji {
   public var jamapuji = 120
}

class Beta: Pitaji() {
    fun showMoney() {
        println(jamapuji)
    }
}