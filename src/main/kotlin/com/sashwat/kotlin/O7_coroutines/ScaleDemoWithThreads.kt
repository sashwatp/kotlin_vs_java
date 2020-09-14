package com.sashwat.kotlin.O7_coroutines

import kotlin.concurrent.thread

fun main(args: Array<String>) {
    val jobs = List(10_000) {
        thread {
            Thread.sleep(1000L)
            print(".")
        }
    }

    jobs.forEach { it.join() }
}