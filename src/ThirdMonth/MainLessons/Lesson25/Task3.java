package ThirdMonth.MainLessons.Lesson25;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<String> words=new ArrayList<>();
        words.add("apple");
        words.add("grape");
        words.add("tomato");

        double averageLength = words.stream()
                .mapToInt(String::length)
                .average()
                .orElse(0.0);
        System.out.println(averageLength);
    }
}
