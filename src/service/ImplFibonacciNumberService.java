package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImplFibonacciNumberService implements FibonacciNumberService {
    @Override
    public List<Integer> getFibonacciNumber(String numbers) {
        List<Integer> listNumbers = parseString(numbers);
        List<Integer> result = new ArrayList<>();
        int first = 0, last = 1, summ = 0, finalNumber = listNumbers.get(1);
        validateListNumbers(listNumbers.get(0), listNumbers.get(1));
        first = listNumbers.get(0);
        result.add(first);
        result.add(last);
        for (int i = first; i <= finalNumber; i++) {
            summ = first + last;
            if (finalNumber > summ) {
                first = last;
                last = summ;
                result.add(summ);
            }
        }
        return result;
    }

    private List<Integer> parseString(String input) {
        String[] split = input.split(",");
        List<Integer> result = new ArrayList<>();
        int[] arrayNumbers = new int[2];
        arrayNumbers[0] = Integer.parseInt(split[0].trim());
        arrayNumbers[1] = Integer.parseInt(split[1].trim());
        result = Arrays.stream(arrayNumbers).boxed().collect(Collectors.toList());
        return result;
    }

    private void validateListNumbers(int firstNumber, int lastNumber) {
        if (lastNumber < firstNumber) {
            throw new IllegalArgumentException("Last number must be bigger then first number");
        } else if (firstNumber < 0) {
            throw new IllegalArgumentException("First number must be bigger then zero");
        } else if (lastNumber <= 0) {
            throw new IllegalArgumentException("Last number must be bugger then zero");
        }
    }

}
