package com.anuj.myapplication.kotlin

import androidx.compose.ui.util.fastForEach

fun main() {
    var names = arrayListOf("anuj","david","john","mice")
    print(names.size)

    names.fastForEach {
        println(it)
    }

    

}