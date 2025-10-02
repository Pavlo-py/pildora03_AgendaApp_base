package org.ulpgc.is1.model;

import java.util.List;

public class Agenda {
    List<Contact> contactList;
    List<Group> groupList;

    public void addPerson(String telephone, String email, String street, int number, int floor, String city, String firstName, String lastName) {
        contactList.add(new Person(telephone, email, street, number, floor, city, firstName, lastName));
    }

    public void addCompany(String telephone, String email, String street, int number, int floor, String city, String name, String description) {
        contactList.add(new Person(telephone, email, street, number, floor, city, name, description));
    }

    public void addGroup(Contact contact, String groupName) {
        Group grupo = new Group(groupName);
        if (groupList.contains(grupo)) {
            if  (!grupo.contacts.contains(contact)) {
                grupo.addMember(contact);
            }
        }
    }

    public List getContactList() {
        return contactList;
    }

    public List getGrouptList() {
        return groupList;
    }
}