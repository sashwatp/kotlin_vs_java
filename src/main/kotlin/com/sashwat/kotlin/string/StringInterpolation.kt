package com.sashwat.kotlin.string

import com.sashwat.kotlin.pojo.User
import java.time.LocalDate

class StringInterpolation {

    fun doThings() {
        val conciseUser = User("John", LocalDate.now())

        /**
         * Variables can be accessed directly inside a strings.
         *
         * The expression is checked at compile time
         */
        println("My name is ${conciseUser.name}")

        println("User: $conciseUser")
    }
}