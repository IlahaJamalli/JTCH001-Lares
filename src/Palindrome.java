import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        while (true){
            System.out.println("Please enter the number: ");
            Scanner scan= new Scanner(System.in);
            int number= scan.nextInt();
            int givenumber=number;
            int rev=0; //reverse number
            while (number!=0){  //345
                rev=rev*10+number%10;
                number=number/10;
            }
            if(givenumber==rev){
                System.out.println("Given number is Palindrome");
            } else if(givenumber!=rev) {
                System.out.println("Given number is not Palindrome");
            }
            System.out.println( );
        }
        }

}
