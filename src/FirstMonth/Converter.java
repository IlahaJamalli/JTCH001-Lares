package FirstMonth;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        char a = scan.next().charAt(0);
        double temperature= scan.nextDouble();
switch (a){
    case 'C':
        System.out.println((temperature*9/5)+32);
        break;
    case 'F':
        System.out.println((temperature-32)*5/9);
    default:
        System.out.println("ERROR");
}
    }
}
