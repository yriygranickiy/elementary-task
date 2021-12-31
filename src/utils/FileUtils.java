package utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class FileUtils {

    public static String readFileToString(String path) throws FileNotFoundException {
        String result = "";
        try {
            result = Files.readString(Paths.get(path));
        } catch (InvalidPathException pathException) {
            throw new FileNotFoundException("Invalid path.");
        } catch (IOException ioException) {
            throw new FileNotFoundException("File not found");
        }
        return result;
    }

    public static void updateFileToString(String path, String value) throws FileNotFoundException {
        try {
            Files.writeString(Paths.get(path), value);
        } catch (InvalidPathException pathException) {
            throw new FileNotFoundException("Invalid path.");
        } catch (IOException ioException) {
            throw new FileNotFoundException("File not found");
        }
    }

}
