package com.sashwat.kotlin.O2_pojo

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

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as UserPojo

        if (name != other.name) return false
        if (dateOfBirth != other.dateOfBirth) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + dateOfBirth.hashCode()
        return result
    }
}