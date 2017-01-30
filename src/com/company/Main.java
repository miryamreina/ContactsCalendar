package com.company;

import com.company.controller.ContactsCalendar;
import com.company.view.Title;

public class Main {

        public static void main(String[] args) {
            Title.printTitle();

            ContactsCalendar agenda=new ContactsCalendar();
            agenda.Calendar();


        }


}
