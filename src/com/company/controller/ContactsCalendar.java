package com.company.controller;


import com.company.CommandParser;
import com.company.model.Command;
import com.company.view.Prompt;
import com.company.view.Message;



public class ContactsCalendar {
    public void Calendar() {

        boolean end = false;


        while (!end) {
            Prompt.print();
            String command = Prompt.read();
            Command com = CommandParser.parse(command);
            int errorCounter=0;

            switch (com) {

                case QUIT:

                    end = true;

                    break;

                case HELP:
                    errorCounter=0;
                    Message.printHelp();

                    break;
                /*case LIST:
                    list.print();

                    break;
                case ADD:
                    Message.printLook(currentRoom);

                    break;

                case DELETE:
                    InventoryManager.take(currentRoom, inventory, CommandParser.detecterParameter);
                    end=true;
                    break;

                    */

                case UNKNOWN:
                    errorCounter=errorCounter +1;
                    errorCounter=Message.printUnknownCommand(errorCounter);

                    break;

                 }





             }


        }
    }

