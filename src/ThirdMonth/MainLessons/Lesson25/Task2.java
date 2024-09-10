package ThirdMonth.MainLessons.Lesson25;

import SecondMonth.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {

        List<String> words=new ArrayList<>();
        words.add("apple");
        words.add("grape");
        words.add("tomato");
        words.add("door");

        List<String> filteredStrings=words.stream()
                .filter(s->s.length()>=5)
                .collect(Collectors.toList());
        System.out.println("Filtered Strings: " + filteredStrings);



    }
}
