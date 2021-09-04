package service;

import model.Chessboard;

public class ChessboardService {

    private Chessboard chessBoard;

    public ChessboardService(Chessboard chessBoard) {
        this.chessBoard = chessBoard;
    }


    public void build() {
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
        System.out.println(result);
    }

}
