package com.sashwat.kotlin.O8_history

import com.sashwat.kotlin.O8_history.model.Order
import com.sashwat.kotlin.O8_history.model.ShippingAddress
import com.sashwat.kotlin.commons.AddressService
import com.sashwat.kotlin.commons.OrderService

class SyncDemo {

    fun isAddressWithinIndia(orderId: String): Boolean {
        val order = getOrderDetails(orderId)
        val shippingAddress = getShippingAddress(order)
        return isAddressWithinIndia(shippingAddress)
    }

    fun getOrderDetails(orderId: String): Order {
//        return OrderService.getOrderDetails(orderId)
        TODO()
    }

    fun getShippingAddress(order: Order): ShippingAddress {
        return AddressService.getShippingAddressDetails(order.shippingAddressId)
    }

    fun isAddressWithinIndia(shippingAddress: ShippingAddress): Boolean {
        return listOf("Gujarat", "Karnataka", "Delhi").contains(shippingAddress.state)
    }
}
