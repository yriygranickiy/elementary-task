package service;

public interface IFileParserService {

    public int getStringAndCount(String input);

    public String getStringAndReplace(String input, String replace);

    public void getPath(String path);
}
