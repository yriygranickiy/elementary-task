package service;

import model.Chessboard;

public class ChessboardService implements IChessboardService {
    
    @Override
    public String build(Chessboard chessboard) {
        return chessboard.toString();
    }

}
