package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    List<Contact> contactList;
    List<Group> groupList;
    public static Integer contactCount = 0;

    public Agenda() {
        this.contactList = new ArrayList<>();
        this.groupList = new ArrayList<>();
    }

    public void addPerson(String firstName, String lastName, String telephone, String email, String street, int number, int floor, String city) {
        Person person = new Person(telephone, email, street, number, floor, city, firstName, lastName);
        boolean check = true;
        for (Contact i : contactList) {
            Person p = (Person) i;
            if (!p.equals(person)) ;
            else {
                check = false;
                break;
            }
        }
        if (check) {
            contactList.add(person);
            contactCount++;
        }
    }

    public void addCompany(String telephone, String email, String street, int number, int floor, String city, String name, String description) {
        Company company = new Company(telephone, email, street, number, floor, city, name, description);
        boolean check = true;
        for (Contact i : contactList) {
            Company c = (Company) i;
            if (!c.equals(company)) ;
            else {
                check = false;
                break;
            }
        }
        if (check) {
            contactList.add(company);
            contactCount++;
        }
    }

    public void addGroup(String groupName) {
        Group grupo = new Group(groupName);
        groupList.add(grupo);
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

}