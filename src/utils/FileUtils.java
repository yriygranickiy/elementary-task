package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileUtils {

    public static String readFileToString(String path) {
        String result = "";
        File fileName = new File(path);
        if (fileName.exists()) {
            try (Stream<String> streamLine = Files.lines(Paths.get(path))) {
                result = streamLine.collect(Collectors.joining());
            } catch (IOException e) {
                e.getMessage();
            }
        } else {
            System.out.println("File '" + fileName + "' not found");
        }
        return result;
    }

    public static void updateFileToString(String path, String value) throws FileNotFoundException {
        try {
            Files.writeString(Paths.get(path), value);
        } catch (IOException ioException) {
            throw new FileNotFoundException("File not found");
        }
    }

}
