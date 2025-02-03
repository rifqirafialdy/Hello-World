package org.Rifqi.entity;

import java.lang.String;

public class Initial {
    private final String fullName;

    public Initial(String fullName) {
        this.fullName = fullName;
    }

    public char[] getInitial() {
        String[] splittedName = fullName.split(" ");
        String firstName = splittedName[0];
        String lastName = splittedName[splittedName.length - 1];
        char[] initial = {Character.toUpperCase(firstName.charAt(0)), Character.toUpperCase(lastName.charAt(0))};
        return initial;
        // make conditional statement

    }
}
