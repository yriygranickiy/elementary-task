package Handler;

import Model.ChessBoard;
import Service.ChessBoardService;
import Utils.Console;

public class ChessBoardHandler {

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
