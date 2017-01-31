package com.company;

import com.company.controller.ContactsCalendar;
import com.company.view.Title;

import java.io.IOException;

public class Main {

        public static void main(String[] args) throws IOException {
            Title.printTitle();

            ContactsCalendar agenda=new ContactsCalendar();
            agenda.Calendar();


        }


}
