package FirstMonth;

import java.util.Scanner;

public class FindLargestNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        Random random = new Random();

        int k = (int) (Math.random() * 10);//guees
        int max = 0;
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a > max) {
            max = a;
        }
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("Max number = " + max);

        if (k == max) {
            System.out.println("The random num " + k + " is equal with " + max);
        } else {
            System.out.println("The random num " + k + " is not equal with " + max);
        }
    }
}
