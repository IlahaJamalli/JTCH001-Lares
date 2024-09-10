package ThirdMonth.MainLessons.Lesson21.HomeWork.Task2;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
    String[] words = {"animal", "camera", "friend", "orange", "software"};
    String word;
    int attempt = 6;

    public Hangman() {
        Random random = new Random();
        word = words[random.nextInt(words.length)];
    }

    public void drawHangman(int attempt) {
        switch (attempt) {
            case 5:
                System.out.println(" O ");
                break;
            case 4:
                System.out.println(" O \n | ");
                break;
            case 3:
                System.out.println(" O \n/| ");
                break;
            case 2:
                System.out.println(" O \n/|\\ ");
                break;
            case 1:
                System.out.println(" O \n/|\\ \n/  ");
                break;
            case 0:
                System.out.println(" O \n/|\\ \n/ \\");
                break;
        }
    }


    public void findLetters() {
        Scanner scan = new Scanner(System.in);
        char[] charArray = word.toCharArray();
        char[] inputArray = new char[charArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = '_';
        }

        while (attempt > 0) {
            System.out.print("Enter your guess: ");
            char input = scan.next().charAt(0);
            boolean isCorrect = false;

            for (int i = 0; i < charArray.length; i++) {
                if (input == charArray[i]) {
                    inputArray[i] = input;
                    isCorrect = true;
                }
            }

            if (!isCorrect) {
                attempt--;
                System.out.println("Your guess letter is wrong");
                drawHangman(attempt);
            } else {
                System.out.println("Your guess letter is correct");
            }

            System.out.print("Current word: ");
            for (int i = 0; i < inputArray.length; i++) {
                System.out.print(inputArray[i]);
            }
            System.out.println();

            boolean letterGuess = true;
            for (int i = 0; i < inputArray.length; i++) {
                if (inputArray[i] == '_') {
                    letterGuess = false;
                    break;
                }
            }

            if (letterGuess) {
                System.out.println("Congratulations! You guessed the word: " + word);
                return;
            }
        }

        if (attempt == 0) {
            System.out.println("Game over! The word is: " + word);
        }
    }

    public static void main(String[] args) {
        Hangman hangman = new Hangman();
        hangman.findLetters();
    }
}
