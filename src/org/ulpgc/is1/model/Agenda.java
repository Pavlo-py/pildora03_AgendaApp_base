package org.ulpgc.is1.model;

import java.util.List;

public class Agenda {
    List<Contact> contactList;
    List<Group> groupList;
    public static Integer contactCount = 0;

    public void addPerson(String firstName, String lastName, String telephone, String email, String street, int number, int floor, String city) {
        contactList.add(new Person(telephone, email, street, number, floor, city, firstName, lastName));
    }

    public void addCompany(String telephone, String email, String street, int number, int floor, String city, String name, String description) {
        contactList.add(new Person(telephone, email, street, number, floor, city, name, description));
    }

    public void addGroup(String groupName) {
        Group grupo = new Group(groupName);
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

}