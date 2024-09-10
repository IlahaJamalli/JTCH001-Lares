package FirstMonth;

import java.util.Scanner;

public class Grade2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your grade: ");
        int grade= scan.nextInt();

        // 91 92 93 94

        int r = grade % 10;

        if(grade<100 && grade>0){
            switch (grade/10){
                case 10:
                case 9:
                    System.out.println("A");
                    break;
                case 8:
                    System.out.println("B");
                    break;
                case 7:
                    System.out.println("C");
                    break;
                case 6:
                    System.out.println("D");
                    break;
                default:
                    System.out.println("F");
            }
        }
        else{
            System.out.println("ERROR");
        }
    }
}

