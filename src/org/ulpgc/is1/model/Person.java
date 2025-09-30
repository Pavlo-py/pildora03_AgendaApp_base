package org.ulpgc.is1.model;

public class Person extends Contact {
    String firstName;
    String lastName;

    public Person(String telephone, String email, String street, int number, int floor, String city) {
        super(telephone, email, street, number, floor, city);
    }

    public String getName() {
        return getFirstName() + " " + getLastName();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
