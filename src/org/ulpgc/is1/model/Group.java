package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Group {

    public final  String name;
    public List<Contact>contacts;

    public Group(String name) {
        this.name = name;
        contacts = new ArrayList<Contact>();
    }
    public void addContact(Contact contact) {
        contacts.add(contact);
        contact.groupList.add(this);
    }

    public void removeContact(int index) {
        contacts.get(index).groupList.remove(this);
        contacts.remove(index);

    }

    public Integer contactCount() {
        return contacts.size();
    }

    public Contact getMember(int index) {
        return contacts.get(index);
    }
}