package test;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import service.FileParserService;
import service.ImplFileParserService;
import utils.FileUtils;

import java.io.FileNotFoundException;

import static org.junit.Assert.assertEquals;

public class FileParserServiceTest {

    private static final FileParserService fileParserService = new ImplFileParserService();
    private static final String PATH_FILE = "test.txt";
    private static final String STRING_FOR_SEARCH = "u";


    @BeforeAll
    public static void init() {
        System.out.println("EnvelopeService test started");
    }


    @Test
    public void testFindStringAndCount() throws FileNotFoundException {
        int expectedResult = 3;
        fileParserService.setPath(PATH_FILE);
        int actualResult = fileParserService.getStringAndCount(STRING_FOR_SEARCH);
        assertEquals("Fail!", expectedResult, actualResult);
    }

    @Test
    public void  testFindStringAndReplace() throws FileNotFoundException {
        String expectedResult = "Meet u family. There are five of us – u parents.";
        String replaceString ="u";
        fileParserService.setPath(PATH_FILE);
        fileParserService.getStringAndReplace(STRING_FOR_SEARCH,replaceString);
        String actualResult = FileUtils.readFileToString(PATH_FILE);
        assertEquals("Fail replace",expectedResult,actualResult);
    }


    @AfterAll
    public static void complete() {
        System.out.println("Testing successfully completed.\n");
    }
}
