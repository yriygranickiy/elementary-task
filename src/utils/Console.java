package utils;

import java.util.Scanner;

public class Console {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getPositiveInt() {
        int input = 0;
        boolean shouldContinue = true;
        while (shouldContinue) {
            try {
                input = scanner.nextInt();
                if (input < 0) {
                    throw new Exception();
                }
                shouldContinue = false;
            } catch (Exception e) {
                System.out.println("Please enter positive integer number:");
                scanner.nextLine();
            }
        }
        return input;
    }

    public static String getAnyChar() {
        String input = null;
        boolean shouldContinue = true;
        while (shouldContinue) {
            input = scanner.next();
            if (input.length() == 1) {
                shouldContinue = false;
            }else{
                System.out.println("Please enter one char");
            }
        }
        return input;
    }

    public static double getPositiveDouble() {
        double positiveDouble = 0;
        boolean shouldContinue = true;
        while(shouldContinue){
            try {
                positiveDouble = scanner.nextDouble();
                if(positiveDouble < 0){
                    throw new Exception();
                }
                shouldContinue = false;
            }catch (Exception exception){
                System.out.println("Please enter positive double number:");
                scanner.nextLine();
            }
        }
        return positiveDouble;
    }

    public static String getString() {
        String input = null;
        boolean shouldContinue = true;
        input = scanner.next();
        while (shouldContinue) {
            if (input.equals("")) {
                scanner.nextLine();
            }
            shouldContinue = false;
        }
        return input;
    }

    public static boolean getConfirmation(String inputConfirmation) {
        System.out.println(inputConfirmation);
        String input;
        boolean result = false;
        boolean shouldContinue = true;
        while (shouldContinue) {
            input = scanner.nextLine();
            if (input.equals("")) {
                input = scanner.nextLine();
            }
            input.toLowerCase();
            if (input.equals("yes") || input.equals("y")) {
                result = true;
                shouldContinue = false;
            } else if (input.equals("no") || input.equals("n")) {
                shouldContinue = false;
            } else {
                System.out.println("Input is not correct");
            }
        }
        return result;
    }
}
