package FirstMonth;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean isPrime = true;
        int n= scan.nextInt();

        for (int i = 2; i <n/2 ; i++) {
            if (n%i == 0){
                isPrime= false;
            }
        }
        if (isPrime==false){
            System.out.println("The number " + n + " is not a prime number");
        } else if (isPrime==true) {
            System.out.println("The number " + n + " is a prime number");
        }}}

