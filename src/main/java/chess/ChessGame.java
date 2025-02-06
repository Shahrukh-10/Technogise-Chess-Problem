package chess;

// ChessGame.java
import chess.pieces.ChessPiece;
import chess.pieces.King;
import chess.pieces.Pawn;
import chess.pieces.Queen;

import java.util.Scanner;

public class ChessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter chess piece and position (e.g., Queen E4): ");
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split(" ");
        if (parts.length != 2) {
            System.out.println("Invalid input format.");
            return;
        }

        String pieceType = parts[0].toLowerCase();
        String position = parts[1].toUpperCase();
        ChessPiece piece;

        switch (pieceType) {
            case "pawn":
                piece = new Pawn(position);
                break;
            case "king":
                piece = new King(position);
                break;
            case "queen":
                piece = new Queen(position);
                break;
            default:
                System.out.println("Invalid chess piece.");
                return;
        }

        System.out.println("Possible moves: " + piece.getValidMoves());
    }
}
