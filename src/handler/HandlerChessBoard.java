package handler;

import model.ChessBoard;
import service.ServiceChessBoard;
import utils.Console;

public class HandlerChessBoard implements Handle {

    public void pucker() {
        System.out.print("Length: ");
        int length = Console.getNumber();
        System.out.print("Width: ");
        int width = Console.getNumber();
        System.out.print("Cell: ");
        String cell = Console.getCell();
        ChessBoard chessBoard = new ChessBoard(length, width, cell);
        ServiceChessBoard chessBoardService = new ServiceChessBoard(chessBoard);
        System.out.println(chessBoardService.build());
    }

}
