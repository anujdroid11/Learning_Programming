package com.anuj.myapplication.kotlin

import android.service.credentials.Action

fun main() {

    customRepeat (times = 10, action = {print("Hello World $it \n")})

}

fun customRepeat(times: Int, action:(i: Int)-> Unit) {
    for (i in 0..times-1) {
        action.invoke(i)
    }
}