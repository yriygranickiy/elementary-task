import handler.ChessboardHandler;
import handler.EnvelopeHandler;
import handler.Handleable;
import handler.TriangleHandler;
import utils.Console;
import utils.Menu;

public class Application {

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
                    Handleable handleable = new ChessboardHandler();
                    boolean shouldContinueTaskChessboard = true;
                    while (shouldContinueTaskChessboard) {
                        handleable.handle();
                        shouldContinueTaskChessboard = Console.getConfirmation("Do you want to build a new chessboard ? yes/no");
                    }
                    break;
                }
                case 2 -> {
                    Handleable handleable = new EnvelopeHandler();
                    boolean shouldContinueTaskEnvelope = true;
                    while (shouldContinueTaskEnvelope){
                        handleable.handle();
                        shouldContinueTaskEnvelope= Console.getConfirmation("Do you want try compare new envelope ? yes/no");
                    }
                    break;
                }
                case 3 -> {
                    Handleable handleable = new TriangleHandler();
                    boolean shouldContinueTaskTriangle = true;
                    while (shouldContinueTaskTriangle){
                        handleable.handle();
                        shouldContinueTaskTriangle = Console.getConfirmation("Do you want try compare new triangles ? yes/no");
                    }
                    break;
                }
            }
        }
    }

}
