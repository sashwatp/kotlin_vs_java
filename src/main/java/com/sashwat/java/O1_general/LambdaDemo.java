package com.sashwat.java.O1_general;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaDemo {

    public List<String> demo(List<String> myList) {
        return myList.stream()
                .filter(item -> item.contains("a"))
                .collect(Collectors.toList());
    }

}
