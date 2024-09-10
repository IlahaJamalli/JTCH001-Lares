package ThirdMonth.MentorLessons.Lesson21.Task2;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class PhoneNumberValidation {

    public static boolean validatePhoneNumberABoolean(String phoneNumber){

        String phoneNumberRegex="^(\\+\\d" +
                "{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]?\\d{3}[\\s.-]?\\d{4}$";
        Pattern pattern=Pattern.compile(phoneNumberRegex);
        Matcher matcher=pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
