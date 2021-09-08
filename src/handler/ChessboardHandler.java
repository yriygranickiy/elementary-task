package handler;

import model.Chessboard;
import service.ChessboardService;
import utils.Console;

public class ChessboardHandler extends Handler {

    private final ChessboardService chessboardService;

    public ChessboardHandler(ChessboardService chessboardService) {
        this.chessboardService = chessboardService;
    }

    public void handle() {
        System.out.print("Length: ");
        int length = Console.getPositiveInt();
        System.out.print("Width: ");
        int width = Console.getPositiveInt();
        System.out.print("Cell: ");
        String cell = Console.getAnyChar();
        Chessboard chessBoard = new Chessboard(length, width, cell);
        String result = chessboardService.build(chessBoard);
        System.out.println(result);
    }

}
