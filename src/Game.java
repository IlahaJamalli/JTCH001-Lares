import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
            int ROCK=1;
            int PAPER=2;
            int SCISSORS=3;
            int player; // choice of player
            int computer = (int)(Math.random()*3+1); // choice of computer
        int playerScore = 0;
        int computerScore = 0;
        String playAgain;
       do{
           System.out.println("Choose 1 for ROCK, 2 for PAPER, 3 for SCISSORS");
            player=scan.nextInt();
           if(player==ROCK){
               if(computer==ROCK){
                   System.out.println("it is a tie");
               }else if(computer==PAPER){
                   System.out.println("You lose"); computerScore++;
               } else if (computer==SCISSORS) {
                   System.out.println("You win"); playerScore++;
               }
           }
           if(player==PAPER){
               if(computer==PAPER){
                   System.out.println("it is a tie");
               }else if(computer==ROCK){
                   System.out.println("You lose");  computerScore++;
               } else if (computer==SCISSORS) {
                   System.out.println("You win"); playerScore++;
               }
           }
           if(player==SCISSORS){
               if(computer==SCISSORS){
                   System.out.println("it is a tie");
               }else if(computer==PAPER){
                   System.out.println("You lose"); computerScore++;
               } else if (computer==ROCK) {
                   System.out.println("You win"); playerScore++;
               }
           }
           System.out.println("Do you want to play again? (yes or not)");
           playAgain=scan.next();
       } while (playAgain.equals("yes"));
        System.out.println("Player score is " + playerScore );
        System.out.println("Computer score is " + computerScore );

    }
}
