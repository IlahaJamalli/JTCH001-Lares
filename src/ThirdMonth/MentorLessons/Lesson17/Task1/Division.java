package ThirdMonth.MentorLessons.Lesson17.Task1;

import java.util.Scanner;

public class Division {

    public static double divideNumbers(int a, int b){
        if(b==0){
            throw new DivisionByZeroException("ERROR: division by 0");
        }
        return (double) a /b;
    }
}
