package com.company.view;

import com.company.Contacts;
import com.company.Person;

import java.awt.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Prompt {
    public static void print(int contactnumber) {
        System.out.print("("+contactnumber+")> ");
    }

    public static String read() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }

    public static Person addContact() {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        person.setName(scanner.nextLine());
        System.out.println("Phone: ");
        person.setPhone(scanner.nextLine());
        return person;
    }

    public static int deleteContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Position of contact that you want to delete");

        int position = Integer.parseInt(scanner.nextLine());
        return position;
    }

    public static void printList(Contacts person) {
        System.out.println("Your list of contacts");

        if (person.getContact().size() == 0) {
            System.out.println("Nothing to see here");
        } else {
            LinkedList<Person> people =person.getContact();

            for (int i = 0; i < person.getContact().size(); i++) {
                Person p = people.get(i);

                System.out.print("(" + i + ") " + p.getName() + "- ");
                System.out.println(p.getPhone());


            }
        }


    }
}
