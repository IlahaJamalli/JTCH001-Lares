package ThirdMonth.MainLessons.Lesson23;

import java.util.Random;
import java.util.Scanner;

public class Game2048 {
    private static final int size = 4;
    private int[][] board;
    private Random random;

    public Game2048() {
        board = new int[size][size];
        random = new Random();
        addRandom();
        addRandom();
    }

    public void addRandom() {
        int emptyCells = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == 0) {
                    emptyCells++;
                }
            }
        }

        int randomCell = random.nextInt(emptyCells);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == 0) {
                    if (randomCell == 0) {
                        board[i][j] = 2;
                        return;
                    }
                    randomCell--;
                }
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print((board[i][j] == 0 ? "_" : board[i][j]) + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void moveLeft() {
        boolean changed = false;

        for (int i = 0; i < size; i++) {
            int[] row = board[i];
            int[] newRow = new int[size];
            int pos = 0;

            for (int j = 0; j < size; j++) {
                if (row[j] != 0) {
                    newRow[pos++] = row[j]; // 0 2 2 4    2 2 4 0

                }
            }
            for (int j = 0; j < size - 1; j++) {
                if (newRow[j] == newRow[j + 1] && newRow[j] != 0) {
                    newRow[j] *= 2;
                    newRow[j + 1] = 0;
                    changed = true;
                } // 2 2 4 0    4 0 4 0
            }


            int[] finalRow = new int[size]; //[0, 0, 0, 0]
            //newRow=4 0 4 0
            pos = 0;
            for (int j = 0; j < size; j++) {
                if (newRow[j] != 0) {
                    finalRow[pos++] = newRow[j]; // 4 4 0 0
                }
            }
            if (!java.util.Arrays.equals(board[i], finalRow)) {
                changed = true;
            }
            board[i] = finalRow;
        }
        if (changed) {
            addRandom();
        }
    }

    public void moveRight() {
        reverse();
        moveLeft();
        reverse();
    }

    public void moveUp() {
        transpose();
        moveLeft();
        transpose();
    }

    public void moveDown() {
        transpose();
        moveRight();
        transpose();
    }

    private void reverse() {
        for (int i = 0; i < size; i++) { //2 4 0 8
            for (int j = 0; j < size / 2; j++) {
                int temp = board[i][j]; //temp=2
                board[i][j] = board[i][size - j - 1]; // board[i][0]=board[i][4-0-1]=8
                board[i][size - j - 1] = temp; // board[i][3]=2
            }
        }
    }

    private void transpose() {
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                int temp = board[i][j];
                board[i][j] = board[j][i];
                board[j][i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game2048 game = new Game2048();
        String input;

        while (true) {
            game.printBoard();

            System.out.println("Enter move (W/A/S/D) or 'Q' to quit: ");
            input = scanner.nextLine().toUpperCase();

            if (input.equals("Q")) {
                break;
            }

            switch (input) {
                case "W":
                    game.moveUp();
                    break;
                case "A":
                    game.moveLeft();
                    break;
                case "S":
                    game.moveDown();
                    break;
                case "D":
                    game.moveRight();
                    break;
                default:
                    System.out.println("Invalid move. Use W, A, S, D or Q.");
            }
        }
    }
}
