public class EightQueens {
    // entry point for the code. Returns the solution as a char[][]
    public static void placeQueens(char[][] board) {
        placeQueensHelper(board, 0);
    }

    // recursive helper function
    // Takes in the current board state and the number of queens left to place.
    // Returns a solution board if it finds one, else returns null.
    private static boolean placeQueensHelper(char[][] board, int numQueens) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                /* TODO: Check if it's safe to put a queen at cell i/j.
                If so try the change, and undo it if it doesn't work */
            }
        }
        return false;
    }

    // Takes in a board and a placement (row + col)
    // Returns true if that is a valid place to put a queen, false if it is not valid.
    // Checks that there are no queens in the same row, the same col, or on a diagonal from the cell.
    private static boolean isSafe(char[][] board, int row, int col) {
        // Check rows
        for (int i = 0; i < 8; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        /* Recursive backtracking is the primary objective for this assignment, not 2D array navigation.
        I've given you the check for rows so you have a starting point for the recursive backtracking.
         I strongly suggest you attempt these TODOs last. */
        // TODO: Check lower-left diagonal from the row/col

        // TODO: Check lower-right diagonal from the row/col

        // TODO: Check upper-left diagonal from the row/col

        // TODO: Check upper-right diagonal from the row/col

        return true;
    }


    public static void main(String[] args) {
        char[][] solution = new char[8][8];
        placeQueens(solution);
        for (char[] row : solution) {
            for (char cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}