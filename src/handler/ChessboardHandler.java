package handler;

import model.Chessboard;
import service.ChessboardService;
import utils.Console;

public class ChessboardHandler implements Handleable {

    public void handle() {
        System.out.print("Length: ");
        int length = Console.getPositiveInt();
        System.out.print("Width: ");
        int width = Console.getPositiveInt();
        System.out.print("Cell: ");
        String cell = Console.getAnyChar();
        Chessboard chessBoard = new Chessboard(length, width, cell);
        ChessboardService service = new ChessboardService(chessBoard);
        service.build();
    }

}
