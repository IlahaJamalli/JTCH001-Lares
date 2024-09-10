package ThirdMonth.MentorLessons.Lesson26.Task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("hello", "world", "abcdefghij", "1234567890", "short");

        input.stream().filter(item->item.length()<=10)
                .sorted((s1, s2)->Integer.compare(s2.length() , s1.length()))
                .collect(Collectors.toList()).forEach(System.out::println);

    }
}
