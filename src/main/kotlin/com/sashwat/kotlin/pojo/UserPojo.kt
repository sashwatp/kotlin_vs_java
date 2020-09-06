package com.sashwat.kotlin.pojo

import java.time.LocalDate

/**
 * NOTE: This code is just for example, do no write POJOs in Kotlin like THIS. Instead use Data classes
 */

/**
 * All classes are by default public and closed (or final)
 */
class UserPojo {

    /**
     * Members are by default public
     */

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