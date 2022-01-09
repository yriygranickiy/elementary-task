package handler;

import service.PowNumberService;
import utils.Console;

public class PowNumberHandler extends Handler{

    private final PowNumberService powNumberService;

    public PowNumberHandler(PowNumberService powNumberService) {
        this.powNumberService = powNumberService;
    }
    @Override
    public void handle() {
        System.out.print("Enter two numbers for race a number to a power: ");
        String numbers = Console.getString();
        System.out.println("Number in pow: "+powNumberService.powNumber(numbers));
    }
}
