package handler;

import service.NumberCountService;
import utils.Console;

public class NumberCountHandler extends Handler {

    private final NumberCountService numberCountService;

    public NumberCountHandler(NumberCountService numberCountService) {
        this.numberCountService = numberCountService;
    }

    @Override
    public void handle() {
        System.out.print("Enter value: ");
        int value = Console.getPositiveInt();
        System.out.println("Numbers whose square is less than your number:");
        System.out.println(numberCountService.numberCountSquare(value));
    }
}
