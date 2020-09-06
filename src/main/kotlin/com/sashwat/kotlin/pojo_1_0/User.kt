package com.sashwat.kotlin.pojo_1_0

import java.time.LocalDate

/**
 * Do no write POJOs in Kotlin like THIS.
 */

class User {

    private val name: String
    private val dateOfBirth: LocalDate

    constructor(name: String, dateOfBirth: LocalDate) {
        this.name = name
        this.dateOfBirth = dateOfBirth
    }

    fun getName(): String {
        return name
    }

    fun getDateOfBirth(): LocalDate {
        return dateOfBirth
    }

    private fun calculateYearOfBirth(): Int {
        return dateOfBirth.year
    }
}