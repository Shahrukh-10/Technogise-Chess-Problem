package chess;


import chess.pieces.King;
import org.junit.Test;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class KingTest {

    @Test
    public void testKingValidMoves() {
        King king = new King("D4");
        Set<String> moves = king.getValidMoves();

        Set<String> expectedMoves = Set.of(
                "C3", "C4", "C5",
                "D3",       "D5",
                "E3", "E4", "E5"
        );

        assertEquals("King's move count is incorrect.",expectedMoves.size(), moves.size());
        assertTrue("King's moves are incorrect.", moves.containsAll(expectedMoves));
    }
}