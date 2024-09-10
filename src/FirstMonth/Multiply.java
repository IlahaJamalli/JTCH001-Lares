package FirstMonth;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
int n= scan.nextInt();

        for(int i=1; i<=10; i++){

            for (int j = 1; j < 11; j++) {

                System.out.println(j + "*" + i +" = "+(j*i));
            }
            System.out.println();
        }
    }
}
