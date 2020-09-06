package com.sashwat.java.pojo;

import com.sashwat.kotlin.pojo.Address;
import lombok.Value;

import java.time.LocalDate;

@Value
public class User {
    String name;
    LocalDate dateOfBirth;
    Address address;
}
