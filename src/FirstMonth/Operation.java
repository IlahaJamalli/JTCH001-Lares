package FirstMonth;

import java.util.Scanner;
public class Operation {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int a= scan.nextInt();
        if(a>10){
            System.out.println(-a);
        } else{
            System.out.println(a);
        }
        if(a%2==0){
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
        double b= scan.nextDouble();
        double sum= a+b;
        System.out.println(sum);

        int rand=(int)(Math.random()*10)+1;
        int res=a+rand;
        System.out.println(res);
        if(res>20){
            System.out.println("it's larger than 20");
        } else{
            System.out.println(" it's not larger than 20");
        }
    }
}
