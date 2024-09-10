package FirstMonth;

import java.util.Scanner;

public class TempratureConverter {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("enter temperature unit: ");
        char a = scan.next().charAt(0);

        System.out.println("enter value: ");
        double temperature= scan.nextDouble();

            if( a =='C'){
                System.out.println((temperature*9/5)+32);
            }  else if( a =='F') {
                System.out.println((temperature-32)*5/9);
            }
            else {
                System.out.println("ERROR");
            }



    }
}
