import handler.*;
import service.*;
import utils.Console;
import utils.Menu;

public class Application {

    private static final String SHOULD_TRY_AGAIN_QUESTION = "Do you want try again? yes/no";

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
                        new ChessboardHandler().handle();
                        shouldContinueTaskChessboard = Console.getConfirmation(SHOULD_TRY_AGAIN_QUESTION);
                    }
                }
                case 2 -> {
                    boolean shouldContinueTaskEnvelope = true;
                    while (shouldContinueTaskEnvelope) {
                        new EnvelopeHandler(new ImplEnvelopeService()).handle();
                        shouldContinueTaskEnvelope = Console.getConfirmation(SHOULD_TRY_AGAIN_QUESTION);
                    }
                }
                case 3 -> {
                    boolean shouldContinueTaskTriangle = true;
                    while (shouldContinueTaskTriangle) {
                        new TriangleHandler(new ImplTriangleService()).handle();
                        shouldContinueTaskTriangle = Console.getConfirmation(SHOULD_TRY_AGAIN_QUESTION);
                    }
                }
                case 4 -> {
                    boolean shouldContinueFileParser = true;
                    while (shouldContinueFileParser) {
                        new FileParserHandler(new ImplFileParserService()).handle();
                        shouldContinueFileParser = Console.getConfirmation(SHOULD_TRY_AGAIN_QUESTION);
                    }
                }
                case 5 -> {
                    boolean shouldContinueNumberInWord = true;
                    while (shouldContinueNumberInWord) {
                        new NumberInWordsHandler(new ImplNumberInWordsService()).handle();
                        shouldContinueNumberInWord = Console.getConfirmation(SHOULD_TRY_AGAIN_QUESTION);
                    }
                }
                case 7 -> {
                    boolean shouldNumberCount = true;
                    while (shouldNumberCount) {
                        new NumberCountHandler(new ImplNumberCountService()).handle();
                        shouldNumberCount = Console.getConfirmation(SHOULD_TRY_AGAIN_QUESTION);
                    }
                }
                case 8 ->{
                    boolean shouldFibonacciNumber  = true;
                    while (shouldFibonacciNumber){
                        new FibonacciNumberHandler(new ImplFibonacciNumberService()).handle();
                        shouldContinue = Console.getConfirmation(SHOULD_TRY_AGAIN_QUESTION);
                    }
                }
            }
        }
    }

}
