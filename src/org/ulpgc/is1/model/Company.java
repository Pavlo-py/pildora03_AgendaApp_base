package org.ulpgc.is1.model;

public class Company extends Contact {
    public String name;
    public String description;

    public Company(String telephone, String email, String street, int number, int floor, String city) {
        super(telephone, email, street, number, floor, city);
    }

    public String getName() {
        return name;
    }
}
