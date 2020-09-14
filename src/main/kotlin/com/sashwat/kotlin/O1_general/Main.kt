package com.sashwat.kotlin.O1_general

/**
 * 1. Talk about syntax
 * 2. Functions are first class citizens - Allowing you to store them in variable,
 *    data structure and pass them as arguments or return from higher order functions
 * 3. String interportation  - At Compile time - Converts it into String Builder.
 */

/**
 * Code that is comparable to Java
 */
fun main(args: Array<String>) {
    for (i in 0..args.size - 1) {
        println(String.format("args[%d]=%s", i, args[i]))
    }
}

/**
 * Concise Code in Kotlin
 */
fun main1(args: Array<String>) = args.forEachIndexed { i, s ->
    println("args[$i]=${args[i]}")
}