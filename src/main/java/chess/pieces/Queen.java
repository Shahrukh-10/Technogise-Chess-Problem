package chess.pieces;

// Queen.java
import chess.model.Position;

import java.util.HashSet;
import java.util.Set;

public class Queen extends ChessPiece {

    public Queen(String pos) {
        super(pos);
    }

    @Override
    public Set<String> getValidMoves() {
        Set<String> moves = new HashSet<>();

        // Horizontal & Vertical
        for (int i = 0; i < 8; i++) {
            if (i != position.getRow()) moves.add(new Position(i, position.getCol()).toChessNotation());
            if (i != position.getCol()) moves.add(new Position(position.getRow(), i).toChessNotation());
        }

        // Diagonal
        for (int i = 1; i < 8; i++) {
            addMoveIfValid(moves, position.getRow() + i, position.getCol() + i);
            addMoveIfValid(moves, position.getRow() - i, position.getCol() - i);
            addMoveIfValid(moves, position.getRow() + i, position.getCol() - i);
            addMoveIfValid(moves, position.getRow() - i, position.getCol() + i);
        }

        return moves;
    }

    private void addMoveIfValid(Set<String> moves, int row, int col) {
        if (isInsideBoard(row, col)) moves.add(new Position(row, col).toChessNotation());
    }
}
