package com.anuj.myapplication.kotlincourse

import android.R.attr.name

abstract class Vehicle(
    val name: String,
) {

    abstract fun color()

    fun carsname(){
        println("The name of the car is $name")
    }

}

class Bike(name: String) : Vehicle(name = name) {
    override fun color(){
        println("The color of the bike is blue")
    }
}


class Car(
    name: String
) : Vehicle(
    name = name
){
    override fun color() {
        println("The color of the car is red")
    }


}


fun main() {

    var myCar = Car(name = "Audi")

    var myBike = Bike(
        name = "GT 650",
    )


    myCar.carsname()
    myCar.color()


    myBike.carsname()
    myBike.color()



}