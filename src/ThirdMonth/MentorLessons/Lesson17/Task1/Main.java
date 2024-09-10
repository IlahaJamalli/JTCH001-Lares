package ThirdMonth.MentorLessons.Lesson17.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        try {
            System.out.println("Enter first number");
            int a=scan.nextInt();
            System.out.println("Enter second number");
            int b=scan.nextInt();
            double res=Division.divideNumbers(a,b);
            System.out.println(res);
        } catch (DivisionByZeroException e){
            System.out.println(e.getMessage());
        }



    }
}
