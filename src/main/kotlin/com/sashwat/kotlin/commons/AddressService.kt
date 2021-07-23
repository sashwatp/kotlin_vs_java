package com.sashwat.kotlin.commons

import com.sashwat.kotlin.O8_history.model.ShippingAddress
import java.util.concurrent.CompletableFuture

object AddressService {

    fun getShippingAddressDetails(addressId: String): ShippingAddress {
        Thread.sleep(1000L)
        return ShippingAddress(
            street = "",
            state = "Gujarat",
            pinCode = "361150"
        )
    }

    fun getShippingAddressDetailsFuture(addressId: String): CompletableFuture<ShippingAddress> {
        Thread.sleep(1000L)
        return CompletableFuture.supplyAsync { address() }
    }

    suspend fun getShippingAddressDetailsAsync(addressId: String) =
        ShippingAddress(
            street = "",
            state = "Gujarat",
            pinCode = "361150"
        )

    private fun address() = ShippingAddress(
        street = "",
        state = "Gujarat",
        pinCode = "361150"
    )
}
