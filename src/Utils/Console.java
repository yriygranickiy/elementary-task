package Utils;

import java.util.Scanner;

public class Console {
    static Scanner scanner = new Scanner(System.in);

    public static int getNumber() {
        int number = scanner.nextInt();
        return number;
    }

    public static String getCell() {
        String input = scanner.next();
        char cell = input.charAt(0);
        return String.valueOf(cell);
    }
}
