package ThirdMonth.MainLessons.Lesson19.SudokuGame;
public class Sudoku {
    private int[][] board;
    private static final int size = 9;

    public Sudoku() {
        board = new int[size][size];
        generateBoard();
    }

    private void generateBoard() {
        int[][] initialBoard = {
                {3, 4, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 1, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        board = initialBoard;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("  ");
                }
                if (board[i][j] == 0) {
                    System.out.print("_");
                } else {
                    System.out.print(board[i][j]);
                }
            }
            System.out.println();
        }
    }
    public boolean isValidMove(int row, int col, int num) {
        for (int i = 0; i < size; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }
        int startRow = row - row % 3; // 7 - 1 = 6
        int startCol = col - col % 3; // 5 - 2 = 3
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean placeNumber(int row, int col, int num) {
        if (isValidMove(row, col, num)) {
            board[row][col] = num;
            return true;
        }
        return false;
    }
}
