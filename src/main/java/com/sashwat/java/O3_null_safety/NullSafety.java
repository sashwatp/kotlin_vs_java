package com.sashwat.java.O3_null_safety;

import com.sashwat.kotlin.O2_pojo.User;
import lombok.NonNull;

import java.util.Optional;

public class NullSafety {

    public void nullCheck(@NonNull String input) {
        // Do things
    }


    public Optional<String> extractStreetAddress(User user) {
        if (user != null
                && user.getAddress() != null
                && user.getAddress().getStreet() != null) {
            return Optional.of(user.getAddress().getStreet());
        }

        throw new IllegalArgumentException("Street address not available");
    }

}
