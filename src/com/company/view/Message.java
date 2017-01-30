package com.company.view;

        import java.util.LinkedList;
        import java.util.Random;


public class Message {

    public static void printHelp(){


        System.out.println("Si introduce el comando (q)uit se sale del programa.");
        System.out.println("Si introduce el comando (l)ist puede ver su lista de contactos ");
        System.out.println("Si introduce (h)elp estás en esta seccion ");
        System.out.println("Si introduce (a)dd puede añador un contacto a su lista");
        System.out.println("Si introduce (d)elete puede eliminar un contacto de su lista ");




    }
    public static int printUnknownCommand(int errorCounter){
        String[] messages= {
                "Invalid data",
                "Try again",
                "Consult the help if it is necessary"

        };

        Random randomGenerator=new Random();

        int index=randomGenerator.nextInt(messages.length);
        System.out.println(messages[index]);

        if (errorCounter > 2){
            printHelp();
            return 0;
        }
        return errorCounter;
    }




}


