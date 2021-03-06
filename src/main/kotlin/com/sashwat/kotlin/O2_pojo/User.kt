package com.sashwat.kotlin.O2_pojo

import java.time.LocalDate

data class User(
    val name: String,
    val dateOfBirth: LocalDate,
    var address: Address? = null
)