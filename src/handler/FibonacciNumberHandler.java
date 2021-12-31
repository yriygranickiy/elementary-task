package handler;

import service.FibonacciNumberService;
import utils.Console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FibonacciNumberHandler extends Handler {

    FibonacciNumberService fibonacciNumberService;

    public FibonacciNumberHandler(FibonacciNumberService fibonacciNumberService) {
        this.fibonacciNumberService = fibonacciNumberService;
    }

    List<Integer> listFibonacciNumber = new ArrayList<>();

    @Override
    public void handle() {
        System.out.print("Enter two positive numbers separated commas:");
        String numbers = Console.getString();
        listFibonacciNumber = fibonacciNumberService.getFibonacciNumber(numbers);
        System.out.println("Fibonacci numbers: "+ Arrays.stream(listFibonacciNumber.toArray()).map(String::valueOf).collect(Collectors.joining(",")));
    }
}
