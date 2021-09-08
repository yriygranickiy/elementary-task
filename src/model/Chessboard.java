package model;

public class Chessboard {

    private final int length;
    private final int width;
    private final String cell;

    public Chessboard(int length, int width, String cell) {
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

    @Override
    public String toString() {
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
