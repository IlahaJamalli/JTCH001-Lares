package ThirdMonth.MainLessons.Lesson21.HomeWork.Task1;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String age=scan.next();
        Integer ageInt=Integer.parseInt(age);
        if(ageInt<18){
            int res=18-ageInt;
            System.out.println("You have "+ res +" years to be 18");
        }
    }

}
