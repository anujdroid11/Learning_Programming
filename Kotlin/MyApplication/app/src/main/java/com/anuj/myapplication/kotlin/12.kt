package com.anuj.myapplication.kotlin

open class Animal1(val name: String) {

    fun sleep(){
        println("$name is sleeping ")
    }

    fun eat(){
        println("$name is eating ")
    }

}

class Dog(name: String) : Animal1(name) {

    fun bark(){
        println("$name is barking ")
    }

}

class Cat(name: String) : Animal1(name) {

    fun meaw(){
        println("$name is meawing ")
    }

}

fun main() {

    val dog = Dog("Buny")
    val cat = Cat("Barbie")

    dog.sleep()
    dog.bark()
    cat.sleep()
    cat.meaw()


}