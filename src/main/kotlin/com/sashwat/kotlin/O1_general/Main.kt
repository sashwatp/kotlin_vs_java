package com.sashwat.kotlin.O1_general

fun main(args: Array<String>) {
    for (i in 0..args.size-1) {
        println(String.format("args[%d]=%s", i, args[i]))
    }
}