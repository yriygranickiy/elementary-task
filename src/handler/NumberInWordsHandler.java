package handler;

import service.NumberInWordsService;
import utils.Console;

public class NumberInWordsHandler extends Handler {

    private final NumberInWordsService numberInWordsService;

    public NumberInWordsHandler(NumberInWordsService numberInWordsService) {
        this.numberInWordsService = numberInWordsService;
    }

    @Override
    public void handle() {
        int number;
        System.out.print("Enter a number: ");
        number = Console.getPositiveInt();
        System.out.println("Number is word : " + numberInWordsService.numberInWords(number));
    }
}
