package com.sashwat.java.O4_semantic_validations;

import com.google.common.base.Preconditions;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.Validate;

import java.util.List;

public class ValidationsDemo {

    public String join(String input, List<String> values) {

        Validate.notBlank(input, "");
        Preconditions.checkArgument(input.length() >= 2, "Input length should be atleast 2");

        Preconditions.checkArgument(CollectionUtils.isNotEmpty(values), "Values cannot be empty");


        Preconditions.checkState(true);
        // ...

        return "";
    }
}
