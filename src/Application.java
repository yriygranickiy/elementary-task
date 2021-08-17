import handler.ChessBoardHandler;
import handler.EnvelopeHandler;
import utils.Console;


public class Application {
    public static void main(String[] args) {
        System.out.println("Input number: ");
        int input = Console.getNumber();

        switch (input){
            case 1:
                ChessBoardHandler chessBoardHandler = new ChessBoardHandler();
                chessBoardHandler.pucker();
                break;
            case 2:
                EnvelopeHandler envelopeHandler = new EnvelopeHandler();
                envelopeHandler.pucker();
                break;
        }
    }
}
