package test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import service.FibonacciNumberService;
import service.ImplFibonacciNumberService;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FibonacciNumberTest {

    private static FibonacciNumberService fibonacciNumberService;

    @BeforeAll
    public static void init() {
        fibonacciNumberService = new ImplFibonacciNumberService();
        System.out.println("FibonacciNumber test started");
    }

    @Test
    void testValidateInputFinalValueLessZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                fibonacciNumberService.getFibonacciNumber("57,-1"));
    }

    @Test
    void testValidateInputFirstNumberLessZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                fibonacciNumberService.getFibonacciNumber("-2,57"));
    }

    @Test
    void testValidateInputValuesLessZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                fibonacciNumberService.getFibonacciNumber("0,0"));
    }

    @Test
    void testGetFibonacciNumberFromRange() {
        List<Integer> exceptedFibonacciNumberList = Arrays.asList(5, 1, 6, 7, 13, 20, 33, 53);
        List<Integer> actualFibonacciNumberList = fibonacciNumberService.getFibonacciNumber("5,57");
        assertEquals("Fail to get Fibonacci numbers range", exceptedFibonacciNumberList, actualFibonacciNumberList);
    }

    @AfterAll
    public static void complete() {
        System.out.println("FibonacciNumber successfully completed.");
    }
}
