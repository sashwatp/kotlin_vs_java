package com.sashwat.kotlin.O3_null_safety

import com.sashwat.kotlin.O2_pojo.User


fun nullReferenceType() {
    var data: String = "John"

//    data = null         // Compiler complains
}

fun nonNullReferenceType(): String {
//    return null         // Compiler complains
    return ""
}

fun safeCallOperator(user: User?): String? {
    return user?.name
}

fun elvisOperator(user: User?): String {
    return user?.name ?: "Default value"
}

fun smartCasting(input: String?): Int {
    return if (input != null) {
        input.length
    } else {
        0
//        input.length
    }
}

fun extractStreetAddress(user: User?): String {
//    if (user != null
//        && user.getAddress() != null
//        && user.getAddress().getStreet() != null) {
//        return user.getAddress().getStreet()
//    }


    /**
     * Code to nested null check
     */
    return user?.address?.street
        ?: throw IllegalArgumentException("Street address not available")
}

