package com.sashwat.java.pojo;

import java.time.LocalDate;
import java.util.Objects;

public final class UserPojo {
    private String name;
    private LocalDate dateOfBirth;

    public UserPojo(final String name, final LocalDate dateOfBirth) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserPojo userPojo = (UserPojo) o;
        return Objects.equals(name, userPojo.name) &&
                Objects.equals(dateOfBirth, userPojo.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateOfBirth);
    }

    @Override
    public String toString() {
        return "UserPojo{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
