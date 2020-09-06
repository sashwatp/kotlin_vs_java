package com.sashwat.java.null_safety;

import com.sashwat.kotlin.pojo.User;
import lombok.NonNull;

import java.util.Optional;

public class NullSafety {

    public void nullCheck(@NonNull String input) {

    }


    public Optional<String> getStreetAddress_NestedNullCheck(User user) {
        if (user != null
                && user.getAddress() != null
                && user.getAddress().getStreet() != null) {
            return Optional.of(user.getAddress().getStreet());
        }

        return Optional.empty();
    }

}
