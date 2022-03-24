package day17;

public class Task2 {
    public static void main(String[] args) {
        String[][] board = {{ChessPiece.ROOK_BLACK.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.ROOK_BLACK.getSign(),ChessPiece.KING_BLACK.getSign(),ChessPiece.EMPTY.getSign()},
                            {ChessPiece.EMPTY.getSign(),ChessPiece.ROOK_WHITE.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.PAWN_BLACK.getSign(),ChessPiece.PAWN_BLACK.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.PAWN_BLACK.getSign()},
                            {ChessPiece.PAWN_BLACK.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.KNIGHT_BLACK.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.PAWN_BLACK.getSign(),ChessPiece.EMPTY.getSign()},
                            {ChessPiece.QUEEN_BLACK.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.BISHOP_WHITE.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.EMPTY.getSign()},
                            {ChessPiece.EMPTY.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.BISHOP_BLACK.getSign(),ChessPiece.PAWN_WHITE.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.EMPTY.getSign()},
                            {ChessPiece.EMPTY.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.BISHOP_WHITE.getSign(),ChessPiece.PAWN_WHITE.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.EMPTY.getSign()},
                            {ChessPiece.PAWN_WHITE.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.QUEEN_WHITE.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.PAWN_WHITE.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.PAWN_WHITE.getSign()},
                            {ChessPiece.EMPTY.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.EMPTY.getSign(),ChessPiece.ROOK_WHITE.getSign(),ChessPiece.KING_WHITE.getSign(),ChessPiece.EMPTY.getSign()}};

        ChessBoard chessBoard = new ChessBoard(board);
        ChessBoard.print(board);
    }
}
