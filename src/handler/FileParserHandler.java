package handler;

import service.IFileParserService;
import utils.Console;

public class FileParserHandler extends Handler {

    private final IFileParserService iFileParserService;

    public FileParserHandler(IFileParserService iFileParserService) {
        this.iFileParserService = iFileParserService;
    }

    @Override
    public void handle() {
        System.out.println("Choose the task mode:\n" +
                "1. Count number of strings in the text.\n" +
                "2. Found and replace strings in the text.");
        int input = Console.getPositiveInt();
        switch (input) {
            case 1 -> {
                System.out.print("Enter filepath:");
                iFileParserService.getPath(Console.getString());
                System.out.print("Enter string:");
                String findString = Console.getString();
                try {
                    System.out.println(iFileParserService.getStringAndCount(findString));
                } catch (NullPointerException nullPointerException) {
                    throw new NullPointerException("File not found.");
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
                } catch (NullPointerException nullPointerException) {
                    throw new NullPointerException("File not found.");
                }
            }
        }
    }

}
