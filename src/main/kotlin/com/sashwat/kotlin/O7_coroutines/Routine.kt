package com.sashwat.kotlin.O7_coroutines

import kotlin.concurrent.thread

fun main() {
    println("main starts")
    thread { routine(1, 500)  }
    thread { routine(2, 300 ) }
    println("main ends")
}

fun routine(number: Int, delay: Long) {
    println("Routine $number starts work")
    Thread.sleep(delay)
    println("Routine $number has finished")
}
