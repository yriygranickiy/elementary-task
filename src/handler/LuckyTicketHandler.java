package handler;

import service.LuckyTicketService;
import utils.Console;
import utils.FileUtils;

import java.io.FileNotFoundException;

public class LuckyTicketHandler extends Handler {

    private final LuckyTicketService luckyTicketService;

    public LuckyTicketHandler(LuckyTicketService luckyTicketService) {
        this.luckyTicketService = luckyTicketService;
    }

    @Override
    public void handle() throws FileNotFoundException {
        System.out.print("Enter path: ");
        String type = FileUtils.readFileToString(Console.getString());
        System.out.print("Enter ticket: ");
        String number = Console.getString();
        System.out.println("Number lucky ticket:" + luckyTicketService.count(type, number));
    }
}
