fun main() {
    // Inheritance
    val obj = Parent()
    println(obj.name)
    println(obj.property)

    val car = Car()
    val myBMWCar = BMWCar()
    myBMWCar.showTyres()
    myBMWCar.body
}

class Parent {
    val name = "Parent"
    val property = "Car"
}

open class Car {
    val Tyres = 4
    val body = "Metal"
}

class BMWCar : Car() {
    fun showTyres(){
        println(Tyres)
    }
}

