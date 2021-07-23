package com.sashwat.kotlin.O7_coroutines

import com.sashwat.kotlin.O8_history.model.Order
import com.sashwat.kotlin.commons.OrderService
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking(Dispatchers.Default) {
        measure {
            val orderIds = listOf("1", "2", "3")
            val orders = mutableListOf<Deferred<Order>>()

            for (orderId in orderIds) {
                orders += async(Dispatchers.Main) { OrderService.getOrderDetails(orderId) }
            }

            for (order in orders) {
                println(order.await())
            }
        }
    }
}

suspend fun measure(block: suspend () -> Unit) {
    val start = System.currentTimeMillis()
    block()
    val end = System.currentTimeMillis()
    println("\nTime: ${end - start}ms")
}


