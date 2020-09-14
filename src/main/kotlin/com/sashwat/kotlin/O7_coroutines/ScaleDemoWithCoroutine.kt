package com.sashwat.kotlin.O7_coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking<Unit> {
    val jobs = List(100_000) {
        launch {
            delay(1000L)
            print(".")
        }
    }

    jobs.forEach {
        it.join()
    }
}