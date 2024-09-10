package ThirdMonth.MentorLessons.Lesson21.Task2;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameValidation {
    public static boolean validateUserName(String name){
        String usernameRegex = "^[a-zA-Z0-9_]{4,15}$";
        Pattern pattern= Pattern.compile(usernameRegex);
        Matcher matcher=pattern.matcher(name);
        return matcher.matches();

    }
}
