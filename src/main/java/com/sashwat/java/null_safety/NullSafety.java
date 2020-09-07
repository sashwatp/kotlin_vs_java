package com.sashwat.java.null_safety;

import com.sashwat.kotlin.pojo.User;
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

        throw new IllegalArgumentException();
    }

}
