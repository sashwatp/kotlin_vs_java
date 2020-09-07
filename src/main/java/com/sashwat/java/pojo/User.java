package com.sashwat.java.pojo;

import lombok.Value;

import java.time.LocalDate;

@Value
public class User {
    String name;
    LocalDate dateOfBirth;
    Address address;
}
