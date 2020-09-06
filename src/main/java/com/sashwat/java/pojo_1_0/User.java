package com.sashwat.java.pojo_1_0;

import java.time.LocalDate;

public final class User {
    private String name;
    private LocalDate dateOfBirth;

    public User(String name, LocalDate dateOfBirth) {
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
