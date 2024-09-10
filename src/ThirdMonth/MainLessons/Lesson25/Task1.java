package ThirdMonth.MainLessons.Lesson25;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        Predicate<Integer> isPositive=(num) -> num > 0;
        int[] num={1, -1, 6};
        for(int numbers: num){
            System.out.println( numbers + " is  positive- " + isPositive.test(numbers));
        }
    }
}
