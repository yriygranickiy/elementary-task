package service;

import java.util.Arrays;

public class ImplLuckyTicketService implements LuckyTicketService {

    private final String TYPE_MOSCOW = "moscow";
    private final String TYPE_PITER = "piter";

    @Override
    public int count(String filePath, String numberTicket) {
        int[] numberLess = getNumberForTicket(numberTicket);
        int result = 0;
        switch (filePath) {
            case TYPE_MOSCOW -> {
                if (typeMoscow(numberLess)) {
                    result++;
                }
            }
            case TYPE_PITER -> {
                if (typePiter(numberLess)) {
                    result++;
                }
            }
        }
        return result;
    }

    public boolean typeMoscow(int[] numberTicket) {
        int sumFirstNumber = numberTicket[0] + numberTicket[1] + numberTicket[2];
        int sumSecondNumber = numberTicket[3] + numberTicket[4] + numberTicket[5];
        if (sumFirstNumber == sumSecondNumber) {
            return true;
        } else {
            return false;
        }
    }

    public boolean typePiter(int[] numberTicket) {
        boolean result = false;
        int sumEvenNumber = 0;
        int sumOddNumber = 0;
        for (int i = 0; i < numberTicket.length; i++) {
            if (numberTicket[i] % 2 == 1) {
                sumOddNumber += numberTicket[i];
            } else {
                sumEvenNumber += numberTicket[i];
            }
        }
        if (sumEvenNumber == sumOddNumber) {
            result = true;
        }
        return result;
    }

    public int[] getNumberForTicket(String type) {
        String[] value = type.split("");
        int[] number = Arrays.stream(value).mapToInt(Integer::parseInt).toArray();
        return number;
    }
}
