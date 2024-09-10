package ThirdMonth.MainLessons.Lesson21.HomeWork.Task1;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class NameRegex {
    public static void main(String[] args) {
        String sentence="Sara sells sea shells by the sea shore";
        Pattern pattern=Pattern.compile("s");
        Matcher matcher=pattern.matcher(sentence);
        int count=0;
        while (matcher.find()){
            count++;
        }
        System.out.println(count);
    }
}
