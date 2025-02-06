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

        int row = position.getRow();
        int col = position.getCol();

        // Manually checking each possible move
        addMove(moves, row - 1, col - 1); // bottom-left
        addMove(moves, row - 1, col);     // king Top
        addMove(moves, row - 1, col + 1); // Top-left
        addMove(moves, row, col - 1);     // king Left
        addMove(moves, row, col + 1);     // king Right
        addMove(moves, row + 1, col - 1); // Bottom-right
        addMove(moves, row + 1, col);     // Bottom
        addMove(moves, row + 1, col + 1); // top-right

        return moves;
    }

    private void addMove(Set<String> moves, int newRow, int newCol) {
        if (isInsideBoard(newRow, newCol)) {
            moves.add(new Position(newRow, newCol).toChessNotation());
        }
    }
}
