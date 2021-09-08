package utils;

import java.util.HashMap;
import java.util.Map;

public class Menu {

    public static void getMenu() {
        Map<Integer, String> menuHashMap = new HashMap<>();
        menuHashMap.put(0, "Exit");
        menuHashMap.put(1, "Chess Board");
        menuHashMap.put(2, "Envelope");
        menuHashMap.put(3, "Triangles");
        menuHashMap.put(4, "File parser");
        menuHashMap.put(5, "Number in the string");
        menuHashMap.put(6, "Lucky tickets");
        menuHashMap.put(7, "Numerical sequence");
        menuHashMap.put(8, "Fibonacci row");
        menuHashMap.put(9, "Ascension");
        menuHashMap.put(10, "Repository");
        menuHashMap.forEach((key, value) -> System.out.println(key + " - " + value));
    }

}
