package handler;

import model.Chessboard;
import service.IChessboardService;
import utils.Console;

public class ChessboardHandler extends Handler {

    private final IChessboardService iChessboardService;

    public ChessboardHandler(IChessboardService iChessboardService) {
        this.iChessboardService = iChessboardService;
    }

    @Override
    public void handle() {
        System.out.print("Length: ");
        int length = Console.getPositiveInt();
        System.out.print("Width: ");
        int width = Console.getPositiveInt();
        System.out.print("Cell: ");
        String cell = Console.getAnyChar();
        Chessboard chessBoard = new Chessboard(length, width, cell);
        String result = iChessboardService.build(chessBoard);
        System.out.println(result);
    }

}
