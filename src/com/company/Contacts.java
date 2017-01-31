package com.company;

import com.company.util.ReadRecord;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

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
    public LinkedList<Person> getPerson() {
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

    public void readRecord() throws IOException {
        List<String>names=new LinkedList<>();
        for (int i = 0; i <contact.size() ; i++) {
            Person person=contact.get(i);
            names.add(person.getName());

        }


        List<String>phones=new LinkedList<>();
        for (int i = 0; i <contact.size() ; i++) {
            Person person=contact.get(i);
            phones.add(person.getPhone());

        }

        ReadRecord.createFile("Names.txt", names);
        ReadRecord.createFile("Phones.txt", phones);
    }

public void readToArchive(){

        if (ReadRecord.readFile("names.txt")!=null) {


            List<String> names = ReadRecord.readFile("names.txt");
            List<String> phones = ReadRecord.readFile("phones.txt");


            for (int i = 0; i < names.size(); i++) {
                Person person = new Person();
                person.setName(names.get(i));

                person.setPhone(phones.get(i));
                contact.add(person);
            }

        }
}
}



