package FirstMonth;

import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        //char grade =scan.next().charAt(0);
        System.out.println("Please enter your grade: ");
        int grade = scan.nextInt();
        if(grade<100 && grade>91){
            System.out.println("A");
        } else if(grade<90 && grade>81){
            System.out.println("B");
        } else if(grade<80 && grade>71){
            System.out.println("C");
        } else if (grade<70 && grade>61) {
            System.out.println("D");
        } else if (grade<60 && grade>0) {
            System.out.println("F");
        } else{
            System.out.println("ERROR");
        }
    }
}
