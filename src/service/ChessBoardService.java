package service;

import model.ChessBoard;

public class ChessBoardService {


    ChessBoard chessBoard ;

    public ChessBoardService(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public String build() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < chessBoard.getLength(); i++) {
            for (int j = 0; j < chessBoard.getWidth(); j++) {
                if ((i + j) % 2 == 1) {
                    result.append(" ");
                } else {
                    result.append(chessBoard.getCell());
                }
            }
            result.append("\n");
        }
        return String.valueOf(result);
    }
}
