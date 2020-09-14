package com.sashwat.kotlin.O2_pojo

import java.time.LocalDate

fun main() {

    var user = User("Jill", LocalDate.now(), null)

    /**
     * 1. Named Parameters allows you to pass individual fields separately.
     */
    val user2 = User(name = "John",
        dateOfBirth = LocalDate.now(),
        address = Address("1011 Pike Street")
    )


    val copyUser = user.copy()

    val copyUser2 = user2.copy(name = "Jill")

    /**
     * NOTE: You do not need to use getAddress. Kotlin treats them properties.
     */
    println(copyUser.address == user.address)
}