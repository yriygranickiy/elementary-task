package service;

import java.io.FileNotFoundException;

public interface FileParserService {

     int getStringAndCount(String input) throws FileNotFoundException;

     String getStringAndReplace(String input, String replace) throws FileNotFoundException;

     String getPath();

     void setPath(String path);
}
