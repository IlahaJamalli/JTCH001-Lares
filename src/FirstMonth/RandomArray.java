package FirstMonth;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
//Generate 10 random numbers and store in an array. Print the largest number.
        int array[]= new int[15];
        Random random= new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.println(array[i]);
        }

        Arrays.sort(array);
        System.out.println("The largest number is: " + array[array.length - 1]);
    }
}
