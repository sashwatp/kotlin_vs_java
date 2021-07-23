package com.sashwat.kotlin

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() = GlobalScope.launch {
    println("This is great ${Thread.currentThread()}")
}


        suspend fun myFunction() {
            // Do Something
            delay(1000)
        }
