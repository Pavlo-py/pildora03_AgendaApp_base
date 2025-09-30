package org.ulpgc.is1.model;

import java.util.List;

public abstract class Contact {
    public String telephone;
    public String email;
    public Address direccion;
    public List<Group> groupList;

    public Contact(String telephone, String email, String street, int number, int floor, String city) {
        this.telephone = telephone;
        this.email = email;
        this.direccion = new Address(street, number, floor, city);
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract String getName();
}