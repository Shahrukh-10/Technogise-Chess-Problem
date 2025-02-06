package chess.pieces;

import chess.model.Position;

import java.util.Set;

public abstract class ChessPiece {
    protected Position position;

    public ChessPiece(String pos) {
        this.position = new Position(pos);
    }

    public abstract Set<String> getValidMoves();

    protected boolean isInsideBoard(int row, int col) {
        return row >= 0 && row < 8 && col >= 0 && col < 8;
    }
}
