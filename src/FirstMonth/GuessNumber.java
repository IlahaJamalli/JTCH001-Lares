package FirstMonth;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int lowerBound = 1;
        int upperBound = 10;
        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("I have chosen a number between " + lowerBound + " and " + upperBound + ".");
        System.out.print("enter a number between 1 and 10: ");
        double a = scan.nextDouble();//target
        int b = (int)(Math.random()*10);//guees

        if(a<b){
            System.out.println("Too low");
            System.out.println("My number was " +b);
        } else if(b<a){
            System.out.println("Too high");
            System.out.println("My number was " +b);
        }
        else {
            System.out.println("Congratulations! You guessed the number");
        }
    }
}
