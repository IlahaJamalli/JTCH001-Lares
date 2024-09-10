package ThirdMonth.MainLessons.Uno;

import java.util.Scanner;

public class CardGame2 {
    public static void main(String[] args) {
        Deck2 deck2 = new Deck2();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int numberOfPlayers = scanner.nextInt();

        for (int i = 1; i <= numberOfPlayers; i++) {
            System.out.println(i + ". Player:");
            deck2.shuffle();
            System.out.println();
        }
    }
}
