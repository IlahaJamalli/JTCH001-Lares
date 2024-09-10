package ThirdMonth.MainLessons.Lesson25;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(2);
        numbers.add(21);
        numbers.add(23);
        numbers.add(52);

        int productOfNumbers=numbers.stream()
                .reduce(1, (a, b) -> a *b);
        System.out.println(productOfNumbers);

    }
}
