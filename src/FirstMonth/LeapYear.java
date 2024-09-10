package FirstMonth;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);
            int year= scan.nextInt();

            if(year%400==0){
                System.out.println("it's a leap year");
            } else if (year %400!=0 && year%100==0) {
                System.out.println("it's not a leap year");
            } else if (year %100!=0 && year%4==0) {
                System.out.println("it's a leap year");
            } else {
                System.out.println("the year is not a leap year");
            }
        }
    }





