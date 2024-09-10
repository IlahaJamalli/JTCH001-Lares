package ThirdMonth.MainLessons.Lesson22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTask {

    public static int calculateSum(List<Integer> numbers){
        int sum=0;
        for(int number: numbers){
            sum+=number;
        } return sum;
    }
    public static int calculateAverage(List <Integer> numbers){
        int sum=calculateSum(numbers);
            sum=sum/numbers.size();
         return sum;
    }

    public static void main(String[] args) {
        List <Integer> list=new ArrayList<>();
        list.add(1);
        list.add(98);
        list.add(34);
        list.add(76);
        list.add(13);
        list.add(9);

        int sum=calculateSum(list);
        System.out.println("sum " + sum);
        int average=calculateAverage(list);
        System.out.println("average " + average);
        int min=Collections.min(list);
        System.out.println("min " + min);
        int max=Collections.max(list);
        System.out.println("max " + max);
    }
}
