package FirstMonth;

import java.util.Scanner;

public class RectangleOperations {
        //## Task 1: Finding the perimeter and area of a rectangle
        //Get the first and second sides of the rectangle through the scanner,
        // write code that finds its perimeter and area.
        public static void main(String[] args) {
            Scanner value=new Scanner(System.in);
            System.out.println("Teref a-ni daxil edin: ");
            double a=value.nextDouble();
            System.out.println("Teref b-ni daxil edin: ");
            double b=value.nextDouble();
            System.out.println("Perimetr " + 2*(a+b));
            System.out.println(a*b);
        }
    }
