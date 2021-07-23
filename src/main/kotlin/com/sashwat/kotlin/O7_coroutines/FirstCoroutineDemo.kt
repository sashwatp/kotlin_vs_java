package com.sashwat.kotlin.O7_coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() {
    println("Starting a coroutine block")
    runBlocking {
        println("Coroutine block started")
        launch {
            println("[${Thread.currentThread()}] First coroutine start, suspend for 50ms")
            delay(50)
            println("[${Thread.currentThread()}] First coroutine : starting some computation for 100ms")
            val t0 = System.currentTimeMillis()
            while (System.currentTimeMillis() - t0 < 100) {
                // Simulate a computation taking 100ms by wasting
                // CPU cycles in this loop
                // We could also use Thread.sleep()
            }
            println("[${Thread.currentThread()}] Computation ended")
        }
        async {
            println("[${Thread.currentThread()}] Second coroutine start, suspend for 100ms")
            val time = measureTimeMillis {
                delay(100)
            }
            println("[${Thread.currentThread()}] Second coroutine end after ${time}ms")
        }
    }
}

