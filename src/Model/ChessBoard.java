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



}
