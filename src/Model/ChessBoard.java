package Model;

import Utils.Console;

public class ChessBoard {
    private int length;
    private int width;
    private String cell;

    public ChessBoard(int length, int width, String cell) {
        this.length = length;
        this.width = width;
        this.cell = cell;
    }

    public ChessBoard() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public void pucker() {
        System.out.print("Length: \n");
        int length = Console.getNumber();
        System.out.print("Width: \n");
        int width = Console.getNumber();
        System.out.print("Cell: \n");
        String cell = Console.getCell();
        ChessBoard chessBoard = new ChessBoard(length, width, cell);
        System.out.println(chessBoard.build());
    }

    public String build() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < getLength(); i++) {
            for (int j = 0; j < getWidth(); j++) {
                if ((i + j) % 2 == 1) {
                    result.append(" ");
                } else {
                    result.append(getCell());
                }
            }
            result.append("\n");
        }
        return String.valueOf(result);
    }
}
