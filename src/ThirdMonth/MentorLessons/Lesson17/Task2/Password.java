package ThirdMonth.MentorLessons.Lesson17.Task2;

import java.util.Scanner;

public class Password {

    public static void validatePassword(String password) throws InvalidPasswordException {
if (password.length()<8){
    throw new InvalidPasswordException("Password can not be shorter than 8");
} if (!password.matches(".*[A-Z].*")){
    throw new InvalidPasswordException("Password must contain at least one uppercase letter.");
    }
if (!password.matches(".*[a-z].*")){
    throw new InvalidPasswordException("Password must contain at least one lowercase letter.");
} if (!password.matches(".*[0-9]*.")){
    throw new InvalidPasswordException("Password must contain at least one digit.");
    }

}

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter password: ");
        String password= scan.next();

        try {
            validatePassword(password);
            System.out.println("Passord is valid");
        } catch (InvalidPasswordException e){
            System.out.println(e.getMessage());
        }

    }
}
