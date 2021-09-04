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
        menuHashMap.put(4, "Palindrome");
        menuHashMap.put(5, "Lucky tickets");
        menuHashMap.put(6, "Numerical sequence");
        menuHashMap.put(7, "Fibonacci row");
        menuHashMap.entrySet().stream()
                .forEach(x -> System.out.println(x.getKey() + " - " + x.getValue()));
    }

}
