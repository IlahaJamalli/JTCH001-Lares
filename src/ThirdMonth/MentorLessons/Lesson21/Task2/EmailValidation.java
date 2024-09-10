package ThirdMonth.MentorLessons.Lesson21.Task2;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidation{
    public static boolean validateEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }


}
