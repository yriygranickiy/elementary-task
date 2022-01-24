package service;

import utils.FileUtils;

import java.io.FileNotFoundException;

public class ImplFileParserService implements FileParserService {
    private String path;

    @Override
    public int getStringAndCount(String input) {
        String result = FileUtils.readFileToString(path).replaceAll(input, "");
        return (FileUtils.readFileToString(path).length() - result.length()) / input.length();
    }

    @Override
    public String getStringAndReplace(String input, String replace) throws FileNotFoundException {
        String result = FileUtils.readFileToString(path).replaceAll(input, replace);
        FileUtils.updateFileToString(path, result);
        return FileUtils.readFileToString(path);
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public void setPath(String path) {
        this.path = path;
    }


}
