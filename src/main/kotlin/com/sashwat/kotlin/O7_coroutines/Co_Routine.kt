package com.sashwat.kotlin.O7_coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("main starts")
    coroutineScope {
        async {
            coroutine(1, 500)
        }
        launch {
            coroutine(2, 300)
        }
    }
    println("main ends")
}

suspend fun coroutine(number: Int, delay: Long) {
    println("Coroutine $number starts work")
    delay(delay)
    println("Coroutine $number has finished")
}
