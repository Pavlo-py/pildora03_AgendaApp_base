package org.ulpgc.is1.model;

public class Person extends Contact {
    String firstName;
    String lastName;

    public Person(String telephone, String email, String street, int number, int floor, String city, String firstName, String lastName) {
        super(telephone, email, street, number, floor, city);
        this.firstName = firstName;
        this.lastName = lastName;
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
