package utils;

import java.util.Scanner;

public class Console {
    static Scanner scanner = new Scanner(System.in);

    public static int getNumber() {
        return scanner.nextInt();
    }

    public static String getCell() {
        String input = scanner.next();
        char cell = input.charAt(0);
        return String.valueOf(cell);
    }

    public static double getDouble(){
        return scanner.nextDouble();
    }
}
