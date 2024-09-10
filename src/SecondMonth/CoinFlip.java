package SecondMonth;

import java.util.Scanner;

public class CoinFlip {

    public void Start(){
        System.out.println("Welcome to CoinFlip Game! ");
        String playAgain;
        do{
            System.out.println("Guess: 0 for Heads or 1 for Tails.");
            System.out.print("Your Guess: ");
            Scanner scan= new Scanner(System.in);
            int UserGuess= scan.nextInt();
            int computerGuess= (int)(Math.random()*2) ;
            System.out.println("Computer Guess is "+computerGuess);
            if(UserGuess==computerGuess){
                System.out.println("Congratulations, correct guess!");
            } else {
                System.out.println("Your guess does not match, play again!");
            }
            System.out.println("Do you want to play again? (yes/no)");
            playAgain= scan.next();
        }
         while (playAgain.equals("yes"));
        }

    public static void main(String[] args) {
        CoinFlip first=new CoinFlip();
        first.Start();
    }


}
