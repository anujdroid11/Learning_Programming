package com.anuj.myapplication.kotlincourse

open class Animal(){

    open fun speak(){
        println("Make a sound")
    }

}

class Dog : Animal(){

    override fun speak(){
        println("Dog is barking ")
    }

}

fun main() {
    var animal = Animal()

    animal.speak()

    var dog = Dog()
    dog.speak()

}