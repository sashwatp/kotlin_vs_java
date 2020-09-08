package com.sashwat.kotlin.O2_pojo

import java.time.LocalDate

fun main() {
    val user = User(name = "John",
        dateOfBirth = LocalDate.now(),
        address = Address("1011 Pike Street")
    )


    val copyUser = user.copy()

    val copyUser2 = user.copy(name = "Jill")

    println(copyUser.address == user.address)
}