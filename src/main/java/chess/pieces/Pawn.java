package chess.pieces;

import chess.model.Position;

import java.util.HashSet;
import java.util.Set;

public class Pawn extends ChessPiece {

    public Pawn(String pos) {
        super(pos);
    }

    @Override
    public Set<String> getValidMoves() {
        Set<String> moves = new HashSet<>();

        int newRow = position.getRow() + 1; // Forward movement to one position

        if (isInsideBoard(newRow, position.getCol())) {
            moves.add(new Position(newRow, position.getCol()).toChessNotation());
        }
        return moves;
    }
}
