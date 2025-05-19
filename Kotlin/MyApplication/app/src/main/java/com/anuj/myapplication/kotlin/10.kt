package com.anuj.myapplication.kotlin

open class Animal(val name: String) {

    fun run(){
        println("$name is Running ")
    }

    fun eat(){
        println("$name is eating ")
    }

}


class Dog(name: String) : Animal(name){

    fun bark(){
        println("$name is barking ")
    }

}

class Cat(name: String) : Animal(name) {

    fun meow(){
        println("$name is meowing ")
    }

}

fun main() {
    var dog = Dog("Buddy")
    var cat = Cat("Wishker")

    dog.eat()
    dog.bark()
    dog.run()
    cat.meow()
    cat.run()
    cat.eat()
}