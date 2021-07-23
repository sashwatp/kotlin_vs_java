package com.sashwat.kotlin.O7_coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

suspend fun main() {
    println("Main started. ${Thread.currentThread()}")
    val job = GlobalScope.launch(Dispatchers.Default) {
        println("This is a coroutine. ${Thread.currentThread()}")
    }

    println("Main Ended. ${Thread.currentThread()}")

    job.join()
}

