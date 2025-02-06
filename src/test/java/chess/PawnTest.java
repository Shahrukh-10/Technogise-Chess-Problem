package chess;

import chess.model.Position;
import chess.pieces.Pawn;

import org.junit.Test;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PawnTest {

    @Test
    public void testWhitePawnValidMoves() {
        Pawn whitePawn = new Pawn("D2");
        Set<String> moves = whitePawn.getValidMoves();

        Set<String> expectedMoves = Set.of("D3"); // Can move one or two squares forward

        assertEquals( "White Pawn's move count is incorrect.",expectedMoves.size(),moves.size());
        assertTrue("White Pawn's moves are incorrect.", moves.containsAll(expectedMoves));
    }

    @Test
    public void testBlackPawnValidMoves() {
        Pawn blackPawn = new Pawn("D7");
        Set<String> moves = blackPawn.getValidMoves();

        Set<String> expectedMoves = Set.of("D8"); // Can move one or two squares forward

        assertEquals("Black Pawn's move count is incorrect.",expectedMoves.size(),moves.size());
        assertTrue("Black Pawn's moves are incorrect.", moves.containsAll(expectedMoves));
    }

    @Test
    public void testPawnMidGameMove() {
        Pawn pawn = new Pawn("D5");
        Set<String> moves = pawn.getValidMoves();

        Set<String> expectedMoves = Set.of("D6"); // Can only move one square forward

        assertEquals("Pawn's mid-game move count is incorrect.",expectedMoves.size(), moves.size());
        assertTrue("Pawn's mid-game moves are incorrect.", moves.containsAll(expectedMoves));
    }
}