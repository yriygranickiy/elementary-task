package model;

public class ChessBoard {
    private int length;
    private int width;
    private String cell;

    public ChessBoard(int length, int width, String cell) {
        this.length = length;
        this.width = width;
        this.cell = cell;
    }
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getCell() {
        return cell;
    }

}
