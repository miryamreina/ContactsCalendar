package com.company;

import java.util.LinkedList;

public class Contacts {

    private LinkedList<Person> contact = new LinkedList<>();

    public Contacts(){

    }
    public void print(){
        for (Person person: contact) {
            System.out.println(person.getName() + ": " + person.getPhone());


        }
    }
    public void add(Person Person) {
        this.contact.add(Person);
    }
    public LinkedList<Person> getPersonas() {
        return contact;
    }

    public boolean isEmpty(){
        return contact.size() == 0;

    }

    public LinkedList<Person> getContact() {
        return contact;
    }

    public void setContact(LinkedList<Person> contact) {
        this.contact = contact;
    }

}
