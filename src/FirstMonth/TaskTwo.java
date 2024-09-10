package FirstMonth;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a=scan.nextInt();
        if (a>0 && a<=100){
            if(a%2==0){
                System.out.println("a is even");
            }
            else {
                System.out.println("a is odd");
            }
        }
       else{
            System.out.println("number is not valid");
        }
    }
}
