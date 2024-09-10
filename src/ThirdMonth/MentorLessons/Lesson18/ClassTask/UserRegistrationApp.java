package ThirdMonth.MentorLessons.Lesson18.ClassTask;

import java.util.Scanner;

public class UserRegistrationApp {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter name: ");
        String name= scan.next();

        System.out.println("Enter password: ");
        String password=scan.next();

        try {
            UserRegistration.registerUser(name, password);
        } catch (UserRegistrationException e){
            System.out.println(e.getMessage());
        }



    }
}
