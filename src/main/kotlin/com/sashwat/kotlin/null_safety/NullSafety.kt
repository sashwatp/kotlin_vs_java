package com.sashwat.kotlin.null_safety

import com.sashwat.kotlin.pojo.User


fun nullReferenceType() {
    var data: String = "John"

    data = null
}

fun nonNullReferenceType(): String {
    return null
}

fun safeCallOperator(user: User?): String? {
    return user?.name
}

fun elvisOperator(user: User?) : String {
    return user?.name ?: "Default value"
}

fun smartCasting(input: String?): Int {
    return if (input != null) {
        input.length
    } else {
        input.length
    }
}

fun getStreetAddress(user: User?): String? {
    return user?.address?.street
}

