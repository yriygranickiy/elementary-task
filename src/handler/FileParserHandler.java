package handler;

import service.FileParserService;
import utils.Console;

import java.io.FileNotFoundException;

public class FileParserHandler extends Handler {

    private final FileParserService iFileParserService;

    public FileParserHandler(FileParserService iFileParserService) {
        this.iFileParserService = iFileParserService;
    }

    @Override
    public void handle() {
        System.out.print("""
                Choose the task mode:
                1. Count number of strings in the text.
                2. Found and replace strings in the text.""");
        int input = Console.getPositiveInt();
        switch (input) {
            case 1 -> {
                System.out.print("Enter filepath:");
                iFileParserService.getPath(Console.getString());
                System.out.print("Enter string:");
                String findString = Console.getString();
                try {
                    System.out.println(iFileParserService.getStringAndCount(findString));
                } catch (FileNotFoundException fileNotFoundException) {
                    System.out.println(fileNotFoundException.getMessage());
                }
            }
            case 2 -> {
                System.out.print("Enter filepath:");
                iFileParserService.getPath(Console.getString());
                System.out.print("Enter string to find:");
                String findString = Console.getString();
                System.out.print("Enter string to replace:");
                String replaceString = Console.getString();
                try {
                    System.out.println(iFileParserService.getStringAndReplace(findString, replaceString));
                } catch (FileNotFoundException fileNotFoundException) {
                    System.out.println(fileNotFoundException.getMessage());
                }
            }
        }
    }

}
