package ThirdMonth.MainLessons.Lesson19.SudokuGame;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            sudoku.printBoard();
            System.out.println("Enter row: ");
            int row = scanner.nextInt();
            System.out.println("Enter column: ");
            int col = scanner.nextInt();
            System.out.println("Enter number: ");
            int num = scanner.nextInt();

            if (row < 0 || row >= 9 || col < 0 || col >= 9 || num <= 0 || num > 9) {
                System.out.println("Invalid input");
                continue;
            }

            if (!sudoku.placeNumber(row, col, num)) {
                System.out.println("Invalid move");
            }
        }

    }
}
