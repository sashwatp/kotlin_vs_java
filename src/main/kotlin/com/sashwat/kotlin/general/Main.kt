package com.sashwat.kotlin.general

fun main(args: Array<String>) {
    args.forEachIndexed { i, a -> println("args[$i]=$a") }
}