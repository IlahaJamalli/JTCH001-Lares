package ThirdMonth.MentorLessons.Lesson17.Task3;

import java.util.Scanner;

public class LoginMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter username: ");
            String username= scan.next();
            System.out.print("Enter password: ");
            String password=scan.next();
            LoginSystem.login(username,password);
            System.out.println("Login successfully");
        } catch (AuthenticationException e){
            System.out.println(e.getMessage());
        }
    }
}


