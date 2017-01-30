package com.company;
import com.company.model.Command;

public class CommandParser {
    public  static String detecterParameter;


    public static Command parse(String text) {
        if (text.equalsIgnoreCase("quit") || text.equalsIgnoreCase("q")) {
            return Command.QUIT;

        }
        if (text.equalsIgnoreCase("help") || text.equalsIgnoreCase("h")) {
            return Command.HELP;
        }


        if (text.equalsIgnoreCase("list") || text.equalsIgnoreCase("l")) {
            return Command.LIST;
        }

        if(text.toLowerCase().startsWith("delete ")){
            String takeArgument=text.toLowerCase().replace("delete ", "");
            detecterParameter = takeArgument;
            return Command.DELETE;
        }

        if(text.toLowerCase().startsWith("d ")){
            String takeArgument=text.toLowerCase().replace("d ", "");
            detecterParameter = takeArgument;
            return Command.DELETE;
        }

        if(text.toLowerCase().startsWith("add ")){
            String dropArgument=text.toLowerCase().replace("add ", "");
            detecterParameter = dropArgument;
            return Command.ADD;
        }

        if(text.toLowerCase().startsWith("a ")){
            String dropArgument=text.toLowerCase().replace("a ", "");
            detecterParameter = dropArgument;
            return Command.ADD;
        }

        return Command.UNKNOWN;

    }

}







