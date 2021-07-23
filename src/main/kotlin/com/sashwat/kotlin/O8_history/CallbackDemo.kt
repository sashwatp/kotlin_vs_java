package com.sashwat.kotlin.O8_history

import com.sashwat.kotlin.O8_history.model.Order
import com.sashwat.kotlin.O8_history.model.ShippingAddress
import com.sashwat.kotlin.commons.AddressService
import com.sashwat.kotlin.commons.OrderService

class CallbackDemo {

    fun isAddressWithinIndia(orderId: String, cb: (Boolean) -> Unit) {
        getOrderDetails(orderId) { order ->
            getShippingAddress(order) { shippingAddress ->
                isAddressWithinIndia(shippingAddress) { isWithinIndia ->
                    cb(isWithinIndia)
                }
            }
        }
    }

    fun getOrderDetails(orderId: String, cb: (Order) -> Unit) {
//        val order = OrderService.getOrderDetails(orderId)
//        cb(order)
        TODO()
    }

    fun getShippingAddress(order: Order, cb: (ShippingAddress) -> Unit) {
        val shippingAddress = AddressService.getShippingAddressDetails(order.shippingAddressId)
        cb(shippingAddress)
    }

    fun isAddressWithinIndia(shippingAddress: ShippingAddress, cb: (Boolean) -> Unit) {
        cb(listOf("Gujarat", "Karnataka", "Delhi").contains(shippingAddress.state))
    }
}
