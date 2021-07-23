package com.sashwat.kotlin.O7_coroutines

fun main() {
    for (value in sequence()) {
        println("Value is $value")
    }
}

fun sequence() = sequence {
    println("One")
    yield(1)

    println("two")
    yield(2)

    println("three")
    yield(3)

    println("done")
}



