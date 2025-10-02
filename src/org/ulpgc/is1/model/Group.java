package org.ulpgc.is1.model;

import java.util.List;

public class Group {

    public final  String name;
    public List<Contact>contacts;

    public Group(String name) {
        this.name = name;
    }
    public void addMember(Contact contact) {
        contacts.add(contact);
        contact.groupList.add(this);
    }

    public void removeMember(Contact contact) {
        contacts.remove(contact);
        contact.groupList.remove(this);
    }
}