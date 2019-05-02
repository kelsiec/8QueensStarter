import java.util.ArrayList;
import java.util.List;

public class EightQueens {
    // entry point for the code. Returns the solution as a char[][]
    public static char[][] placeQueens(char[][] board) {
        return placeQueensHelper(board, 0);
    }

    // recursive helper function
    // Takes in the current board state and the number of queens left to place.
    // Returns a solution board if it finds one, else returns null.
    private static char[][] placeQueensHelper(char[][] board, int numQueens) {
        // TODO: Base case. If 8 queens have been placed, the board is solved. Return it.

        for (char[][] option : getValidPlacements(board)) {
            // TODO: Make the recursive sub-call, and propagate the result if isn't null
        }
        return null;
    }

    // Called by placeQueensHelper.
    // Takes in the current board state.
    // Returns all potential boards where one queen is added to the current board in a valid position.
    private static List<char[][]> getValidPlacements(char[][] board) {
        List<char[][]> options = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                // TODO: Check if it's safe to put a queen at cell i/j.
                // If so, make a deep copy of the board, make the change on the new board, and
                // add the new board to the list of options.
            }
        }

        return options;
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

        // TODO: Check lower-left diagonal from the row/col

        // TODO: Check lower-right diagonal from the row/col

        // TODO: Check upper-left diagonal from the row/col

        // TODO: Check upper-right diagonal from the row/col

        return true;
    }


    public static void main(String[] args) {
        char[][] solution = placeQueens(new char[8][8]);
        for (char[] row : solution) {
            for (char cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}
