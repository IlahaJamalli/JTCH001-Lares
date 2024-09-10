package ThirdMonth.MentorLessons.Lesson27.Task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProcessing {
    public static void main(String[] args) {
        List <Integer> num= Arrays.asList(5, 2, 8, 1, 9, 3, 2, 8, 5);
        List <Integer> nums=num.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(nums);

    }
}
