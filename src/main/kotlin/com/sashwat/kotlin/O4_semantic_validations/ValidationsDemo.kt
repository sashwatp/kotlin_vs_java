package com.sashwat.kotlin.O4_semantic_validations

class ValidationsDemo {

    fun join(input: String?, values: List<String>) {
        requireNotNull(input) {"Input cannot be null"}

        require(input.length >= 2) {"Input length should be atleast 2"}
        require(values.isNotEmpty()) {"Values cannot be null"}

        check(true) { "State condition failed"}
    }
}