package com.anuj.myapplication.kotlin


open class Father() {

    fun bike() {
        println("Bike ")
    }

}

class Child() : Father() {

    fun car(){
        println("Car ")
    }

}

fun main() {

    var child = Child()

    child.bike()
    child.car()

}