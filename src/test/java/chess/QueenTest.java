package chess;


import chess.pieces.Queen;
import org.junit.Test;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class QueenTest {

    @Test
    public void testQueenValidMoves() {
        Queen queen = new Queen("D4");
        Set<String> moves = queen.getValidMoves();

        Set<String> expectedMoves = Set.of(
                "G1", "G4", "E3", "E4", "E5", "C3", "G7", "A1", "C4", "C5", "A4", "A7", "H4", "F2", "D1", "D2", "F4", "D3", "F6", "B2", "H8", "D5", "B4", "D6", "D7", "D8", "B6"
        );

        assertEquals("Queen's move count is incorrect.",expectedMoves.size(), moves.size());
        assertTrue("Queen's moves are incorrect.", moves.containsAll(expectedMoves));
    }
}