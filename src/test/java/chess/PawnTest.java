package chess;

import chess.pieces.Pawn;

import org.junit.Test;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PawnTest {

    @Test
    public void testPawnValidMoves() {
        Pawn blackPawn = new Pawn("D7");
        Set<String> moves = blackPawn.getValidMoves();

        Set<String> expectedMoves = Set.of("D8"); // Can move one or two squares forward

        assertEquals("Pawn move count is incorrect.",expectedMoves.size(),moves.size());
        assertTrue("Pawn moves are incorrect.", moves.containsAll(expectedMoves));
    }

    @Test
    public void testPawnMidGameMove() {
        Pawn pawn = new Pawn("D5");
        Set<String> moves = pawn.getValidMoves();

        Set<String> expectedMoves = Set.of("D6"); // Can only move one square forward

        assertEquals("Pawn move count is incorrect.",expectedMoves.size(), moves.size());
        assertTrue("Pawn moves are incorrect.", moves.containsAll(expectedMoves));
    }
}