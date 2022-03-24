package day17;

public class ChessBoard {
    private String[][] board;

    public ChessBoard(String[][] board) {
        this.board = board;
    }

    public static void print(String[][] board) {
        for (int i = 0; i< board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
