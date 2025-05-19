package com.anuj.myapplication.kotlin

open class Vehicle(){

    fun engine(){
        println("Vehicle has engine ")
    }

    fun wheels(){
        println("Vehicle has 4 wheels ")
    }

    fun run(){
        println("Vehicle is running ")
    }

}

open class Car() : Vehicle(){

    fun color(){
        println("Car is Black ")
    }


}


class sportsCar() : Car() {

    fun speed(){
        println("Sports car is fast ")
    }
}

fun main() {

    var sportsCar = sportsCar()

    sportsCar.speed()
    sportsCar.color()
    sportsCar.engine()

}