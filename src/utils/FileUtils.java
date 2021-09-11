package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class FileUtils {

    public static String readFileToString(String path) {
        String result = "";
        try {
            result = Files.readString(Paths.get(path));
        } catch (InvalidPathException pathException) {
            System.out.println("Invalid Path.");
        } catch (IOException ioException) {
            System.out.println("File not found.");
        }
        return result;
    }

    public static void updateFileToString(String path, String value) {
        try {
            Files.writeString(Paths.get(path), value);
        } catch (InvalidPathException pathException) {
            System.out.println("Invalid Path.");
        } catch (IOException ioException) {
            System.out.println("File not found.");
        }
    }

}
