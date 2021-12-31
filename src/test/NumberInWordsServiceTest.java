package test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import service.ImplNumberInWordsService;
import service.NumberInWordsService;

import static org.junit.Assert.*;

public class NumberInWordsServiceTest {

    private static NumberInWordsService numberInWordsService;

    @BeforeAll
    public static void init() {
        numberInWordsService = new ImplNumberInWordsService();
        System.out.println("EnvelopeService test started");
    }

    @Test
    void testNumberInWords() {
        String expectedResult = "eleven million one hundred forty-six thousand";
        String actualResult = numberInWordsService.numberInWords(11146000);
        assertEquals("Fail to get number.", expectedResult, actualResult);
    }

    @Test
    void testValidateNumber() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                numberInWordsService.numberInWords(1_000_000_000));
    }

    @AfterAll
    public static void complete() {
        System.out.println("Testing successfully completed.");
    }
}
