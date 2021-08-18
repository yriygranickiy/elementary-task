import handler.HandlerChessBoard;
import handler.HandlerEnvelope;
import utils.Console;
import utils.Menu;


public class Application {
    public static void main(String[] args) {
        boolean exit = true;
        Menu.getMenu();
        while (exit) {
            System.out.print("Input number: ");
            int input = Console.getNumber();
            switch (input) {
                case 0:
                    System.out.println("Exit");
                    exit = false;
                    break;
                case 1:
                    System.out.println("Enter numbers for chessboard...");
                    HandlerChessBoard chessBoardHandler = new HandlerChessBoard();
                    chessBoardHandler.pucker();
                    exit = false;
                    break;
                case 2:
                    System.out.println("Enter width and length  for envelopes...");
                    HandlerEnvelope envelopeHandler = new HandlerEnvelope();
                    envelopeHandler.pucker();
                    exit = false;
                    break;
            }
        }


    }
}
