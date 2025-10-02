package org.ulpgc.is1.model;

public class Company extends Contact {
    public String name;
    public String description;

    public Company(String telephone, String email, String street, int number, int floor, String city, String name, String description) {
        super(telephone, email, street, number, floor, city);
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }
}
