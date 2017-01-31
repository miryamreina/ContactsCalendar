package com.company.controller;


import com.company.CommandParser;
import com.company.Contacts;
import com.company.Person;
import com.company.model.Command;
import com.company.view.Prompt;
import com.company.view.Message;

import java.io.IOException;


public class ContactsCalendar {

    Contacts contacts = new Contacts();
    public void Calendar() throws IOException {

        contacts.readToArchive();
        boolean end = false;


        while (!end) {
            Prompt.print(contacts.getContact().size());
            String command = Prompt.read();
            Command com = CommandParser.parse(command);
            int errorCounter=0;

            switch (com) {

                case QUIT:
                    contacts.readRecord();
                    end = true;

                    break;

                case HELP:
                    errorCounter=0;
                    Message.printHelp();

                    break;


                case ADD:
                   Person person= Prompt.addContact();
                   contacts.getContact().add(person);
                    break;

                  case LIST:
                        Prompt.printList(contacts);

                    break;

                case DELETE:
                    if (contacts.getContact().size()==0){
                        System.out.println("Your list is empty");


                    }else{
                        int position = Prompt.deleteContact();
                        if (position>=0  && position<contacts.getContact().size()){
                            contacts.getContact().remove(position);
                            System.out.println();
                            System.out.println("Deleted Contact");
                            System.out.println();
                            Prompt.printList(contacts);
                        }else {
                            System.out.println("There is no contact in that position");
                        }
                    }


                    break;



                case UNKNOWN:
                    errorCounter=errorCounter +1;
                    errorCounter=Message.printUnknownCommand(errorCounter);

                    break;

                 }





             }


        }
    }

