package FirstMonth;

import java.util.Scanner;
public class SignInSystem {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String username = input.next();
        int password = input.nextInt();
        if(username.equals("admin") && password==12345){
            System.out.println("You are logged in");
        } else {
            System.out.println("You are not logged in");
        }

    }
}
