package org.ulpgc.is1.model;

import java.sql.Date;
import java.time.LocalDateTime;
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
        Member member = new Member(contact,this);
        member.members.add(member);
    }

    public void removeContact(int index) {
        contacts.get(index).groupList.remove(this);
        contacts.remove(index);

    }

    public Integer contactCount() {
        return contacts.size();
    }

    public Member getMember(int index) {
        Contact contact = contacts.get(index);
        for (Member member : Member.members) {
            if (member.contact == contact) {
                return member;
            }
        }
        return null;
    }
}