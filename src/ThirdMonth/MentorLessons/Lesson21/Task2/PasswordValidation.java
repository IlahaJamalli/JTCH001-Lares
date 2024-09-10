package ThirdMonth.MentorLessons.Lesson21.Task2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class PasswordValidation {

    public static boolean validatePassword(String password){
        String passwordRegex="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@!#$%^&*])[A-Za-z\\d@!#$%^&*]{8,}$";
        Pattern pattern=Pattern.compile(passwordRegex);
        Matcher matcher=pattern.matcher(password);
        return matcher.matches();
    }
}
