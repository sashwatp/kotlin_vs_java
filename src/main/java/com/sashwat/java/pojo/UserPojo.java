package com.sashwat.java.pojo;

import java.time.LocalDate;

public final class UserPojo {
    private String name;
    private LocalDate dateOfBirth;

    public UserPojo(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    private int calculateAge() {
        return dateOfBirth.getYear();
    }
}
