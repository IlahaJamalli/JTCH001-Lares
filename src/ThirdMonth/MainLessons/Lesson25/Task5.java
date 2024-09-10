package ThirdMonth.MainLessons.Lesson25;
import java.util.Arrays;
import java.util.stream.LongStream;

public class Task5 {
    public static void main(String[] args) {
        double[] doublesArray = {5.7, 3.4, 2.1, 9.9, -6.2, 3.3};

         Arrays.stream(doublesArray)
                .mapToLong(Math::round)
         ;
    }
}
