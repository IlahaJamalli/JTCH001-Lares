package ThirdMonth.MainLessons.Lesson21.HomeWork.Task1;

import java.util.Scanner;

public class WrapperClass {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        Integer b=Integer.valueOf(a);
        int doubleOfb=b*2;
        System.out.println(a);
        System.out.println(b);
        System.out.println(doubleOfb);


    }

}
