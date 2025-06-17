public class Nqueen {
    public static void main(String[] args) {
        int[][] board = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
        };
        solveQueen(board, 0);
    }
    public static void solveQueen(int[][] board, int row) {
        if (row == board.length) {
            printBoard(board);
            System.out.println("------------------------------------------------------------");
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;
                solveQueen(board, row + 1);
                board[row][col] = 0;
            }
        }
    }
    public static boolean isSafe(int[][] board, int row, int col) {
        int r, c;
        for (r = 0; r < row; r++) {
            if (board[r][col] == 1) return false;
        }

        r = row - 1;
        c = col - 1;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == 1) return false;
            r--;
            c--;
        }
        r = row - 1;
        c = col + 1;
        while (r >= 0 && c < board.length) {
            if (board[r][c] == 1) return false;
            r--;
            c++;
        }

        return true;
    }
    public static void printBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] == 1 ? "Q " : ". ");
            }
            System.out.println();
        }
    }
}
