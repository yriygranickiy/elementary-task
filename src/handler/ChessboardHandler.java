package handler;

import model.Chessboard;
import utils.Console;

public class ChessboardHandler extends Handler {

    @Override
    public void handle() {
        System.out.print("Length: ");
        int length = Console.getPositiveInt();
        System.out.print("Width: ");
        int width = Console.getPositiveInt();
        System.out.print("Cell: ");
        String cell = Console.getAnyChar();
        Chessboard chessBoard = new Chessboard(length, width, cell);
        System.out.println(chessBoard);
    }

}
