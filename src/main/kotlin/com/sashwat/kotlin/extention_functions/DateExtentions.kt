package com.sashwat.kotlin.extention_functions

import java.time.LocalDate
import java.util.*

fun Date.isTuesday(): Boolean {
    return day == 2
}