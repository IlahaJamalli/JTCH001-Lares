package FirstMonth;

import java.util.Scanner;

public class BiggestElementArray {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows= scan.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns= scan.nextInt();
        int element;
        int max=0;
        int[][] array=new int[rows][columns];

        System.out.println("Enter the elements of array: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position " + "(" + i + "," + j + ")" + ": " );
               element=scan.nextInt();
               if(element>max){
                   max=element;
               }
            }
        }
        System.out.println("Biggest number is: " + max);
    }

}
