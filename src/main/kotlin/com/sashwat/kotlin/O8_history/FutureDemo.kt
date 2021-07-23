package com.sashwat.kotlin.O8_history

import com.sashwat.kotlin.O8_history.model.Order
import com.sashwat.kotlin.O8_history.model.ShippingAddress
import com.sashwat.kotlin.commons.AddressService
import com.sashwat.kotlin.commons.OrderService
import java.util.concurrent.CompletableFuture

class FutureDemo {

    fun isAddressWithinIndia(orderId: String): CompletableFuture<Boolean> {
        return getOrderDetails(orderId)
            .thenCompose { order -> getShippingAddress(order) }
            .thenApply { address -> isAddressWithinIndia(address) }
    }

    fun getOrderDetails(orderId: String): CompletableFuture<Order> {
        return OrderService.getOrderDetailsFuture(orderId)
    }

    fun getShippingAddress(order: Order): CompletableFuture<ShippingAddress> {
        return AddressService.getShippingAddressDetailsFuture(order.shippingAddressId)
    }

    fun isAddressWithinIndia(shippingAddress: ShippingAddress): Boolean {
        return listOf("Gujarat", "Karnataka", "Delhi").contains(shippingAddress.state)
    }
}
