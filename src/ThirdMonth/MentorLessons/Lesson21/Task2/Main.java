package ThirdMonth.MentorLessons.Lesson21.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Please enter User name: ");
        String username=scan.nextLine();
        if(UserNameValidation.validateUserName(username)){
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid Username");
        }

        System.out.print("Please enter Email: ");
        String email= scan.nextLine();
        if(EmailValidation.validateEmail(email)){
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }


        System.out.print("Please enter phone number: ");
        String number=scan.nextLine();
        if(PasswordValidation.validatePassword(number)){
            System.out.println("Valid number");
        } else {
            System.out.println("Invalid number");
        }


        System.out.print("Please enter phone password: ");
        String userPassword=scan.nextLine();
        if(PasswordValidation.validatePassword(userPassword)){
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}
