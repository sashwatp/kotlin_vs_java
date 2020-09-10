package com.sashwat.java.O3_null_safety;

import com.sashwat.kotlin.O2_pojo.Address;
import com.sashwat.kotlin.O2_pojo.User;
import lombok.NonNull;

import java.util.Optional;

public class NullSafety {

    public void nullCheck(@NonNull String input) {
        // Do things
    }


    public String extractStreetAddress(User user) {
        return Optional.ofNullable(user)
                .map(User::getAddress)
                .map(Address::getStreet)
                .orElseThrow(() -> new IllegalArgumentException("Street address not available"));
    }
}
