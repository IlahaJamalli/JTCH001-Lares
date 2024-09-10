package FirstMonth;

import java.util.Scanner;
//## Task 2: Finding the perimeter and area of a circle
//
//Write code that finds the area and perimeter of a circle
//by taking the radius of the circle from the user through the scanner.
public class Cycle {
    public static void main(String[] args) {
        Scanner value =new Scanner(System.in);
        System.out.println("Radius daxil edin:");
        double r= value.nextDouble();
        System.out.println(2*Math.PI*r);
        System.out.println(Math.PI * Math.pow(r,2));


    }
}
