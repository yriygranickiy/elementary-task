import handler.*;
import service.ChessboardService;
import service.EnvelopeService;
import utils.Console;
import utils.Menu;

public class Application {

    private static final String TRY_AGAIN_YES_NO = "Do you want try again? yes/no";

    public static void main(String[] args) {
        boolean shouldContinue = true;
        Menu.getMenu();
        while (shouldContinue) {
            System.out.print("Input number: ");
            switch (Console.getPositiveInt()) {
                case 0 -> {
                    System.out.println("Exit");
                    shouldContinue = false;
                }
                case 1 -> {
                    boolean shouldContinueTaskChessboard = true;
                    while (shouldContinueTaskChessboard) {
                        new ChessboardHandler(new ChessboardService()).handle();
                        shouldContinueTaskChessboard = Console.getConfirmation(TRY_AGAIN_YES_NO);
                    }
                }
                case 2 -> {
                    boolean shouldContinueTaskEnvelope = true;
                    while (shouldContinueTaskEnvelope) {
                        new EnvelopeHandler(new EnvelopeService()).handle();
                        shouldContinueTaskEnvelope = Console.getConfirmation(TRY_AGAIN_YES_NO);
                    }
                }
                case 3 -> {
                    boolean shouldContinueTaskTriangle = true;
                    while (shouldContinueTaskTriangle) {
                        new TriangleHandler().handle();
                        shouldContinueTaskTriangle = Console.getConfirmation(TRY_AGAIN_YES_NO);
                    }
                }
                case 4 -> {
                    boolean shouldContinueFileParser = true;
                    while (shouldContinueFileParser) {
                        new FileParserHandler().handle();
                        shouldContinueFileParser = Console.getConfirmation(TRY_AGAIN_YES_NO);
                    }
                }
            }
        }
    }

}
