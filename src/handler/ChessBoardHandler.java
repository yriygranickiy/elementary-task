package handler;

import model.ChessBoard;
import service.ChessBoardService;
import utils.Console;

public class ChessBoardHandler implements Handle {

    public void pucker(){
        System.out.print("Length: \n");
        int length = Console.getNumber();
        System.out.print("Width: \n");
        int width = Console.getNumber();
        System.out.print("Cell: \n");
        String cell = Console.getCell();
        ChessBoard chessBoard = new ChessBoard(length, width, cell);
        ChessBoardService chessBoardService = new ChessBoardService(chessBoard);
        System.out.println(chessBoardService.build());
    }
}
