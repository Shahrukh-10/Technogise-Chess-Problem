package chess.model;

// Position.java
public class Position {
    private int row; // 0-7 (1-8 in chess notation)
    private int col; // 0-7 (A-H in chess notation)

    public Position(String notation) {
        if (notation.length() != 2) throw new IllegalArgumentException("Invalid position format");

        this.col = notation.charAt(0) - 'A';
        this.row = Character.getNumericValue(notation.charAt(1)) - 1;

        if (!isValid()) throw new IllegalArgumentException("Position out of board range");
    }

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public boolean isValid() {
        return row >= 0 && row < 8 && col >= 0 && col < 8;
    }

    public String toChessNotation() {
        return (char) ('A' + col) + String.valueOf(row + 1);
    }

    public int getRow() { return row; }
    public int getCol() { return col; }
}
