package com.sashwat.kotlin.O1_general

import java.util.stream.Collectors

/**
 *
 * NOTE: In Kotlin these are not lazy operations as with Java Stream. 
 */
fun demo(myList: List<String>): List<String> {

    return myList.stream()
        .filter({ item -> item.contains("a") })
        .collect(Collectors.toList())


}