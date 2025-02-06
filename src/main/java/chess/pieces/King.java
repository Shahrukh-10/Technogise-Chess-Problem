package chess.pieces;

import chess.model.Position;
import java.util.HashSet;
import java.util.Set;

public class King extends ChessPiece {
    public King(String pos) {
        super(pos);
    }

    @Override
    public Set<String> getValidMoves() {
        Set<String> moves = new HashSet<>();
        // If we want sorted moves then use tree set

        int row = position.getRow();
        int col = position.getCol();

        addMove(moves, row - 1, col - 1); // Bottom Left
        addMove(moves, row - 1, col); // Bottom
        addMove(moves, row - 1, col + 1); // Bottom Right
        addMove(moves, row, col - 1); // Left
        addMove(moves, row, col + 1); // Right
        addMove(moves, row + 1, col - 1); // Top Left
        addMove(moves, row + 1, col); // Top
        addMove(moves, row + 1, col + 1); // Top Right

        return moves;
    }

    private void addMove(Set<String> moves, int newRow, int newCol) {
        if (isInsideBoard(newRow, newCol)) {
            moves.add(new Position(newRow, newCol).toChessNotation());
        }
    }
}
