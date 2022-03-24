package day17;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String[] chessPiece = new String[8];

        Arrays.fill(chessPiece,0, 4, ChessPiece.PAWN_WHITE.getSign());
        Arrays.fill(chessPiece,4, 8, ChessPiece.ROOK_BLACK.getSign());

        //System.out.println(Arrays.toString(chessPiece));
        for (String piece: chessPiece) {
            System.out.print(piece + " ");
        }
    }
}