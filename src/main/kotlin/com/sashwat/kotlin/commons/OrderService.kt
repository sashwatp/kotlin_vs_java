package com.sashwat.kotlin.commons

import com.sashwat.kotlin.O8_history.model.Order
import kotlinx.coroutines.delay
import java.util.concurrent.CompletableFuture

object OrderService {

    suspend fun getOrderDetails(orderId: String): Order {
        delay(1000L)
        return Order(orderId, "AddressId1")
    }

    fun getOrderDetailsFuture(orderId: String): CompletableFuture<Order> {
        Thread.sleep(1000L)
        return CompletableFuture.supplyAsync { Order(orderId, "AddressId1") }
    }
}
