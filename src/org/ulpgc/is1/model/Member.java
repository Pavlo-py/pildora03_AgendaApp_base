package org.ulpgc.is1.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Member {
    public  Contact contact;
    public Group group;
    public LocalDateTime date;
    public static List<Member> members;

    public Member(Contact contact, Group group) {
        this.date = LocalDateTime.now();
        this.contact = contact;
        this.group = group;
        members = new ArrayList<Member>();
    }


    public LocalDateTime getDate() {
        return date;
    }
}
