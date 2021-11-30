package com.charuniverse.javareflection.data;

public enum Gender {

    MALE("Male"),
    FEMALE("Female");

    private final String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
