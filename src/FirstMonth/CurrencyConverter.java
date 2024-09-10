package FirstMonth;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number to be converted: ");
        int amount= scan.nextInt();

        System.out.println("Enter source currency code: ");
        String sourceCurrency=scan.next();

        System.out.println("Enter target currency code: ");
        String targetCurrency=scan.next();


        switch (sourceCurrency) {
            case "USD":
                switch (targetCurrency){
                    case "AZN" :
                        System.out.println("Converted amount " + amount*1.7);
                        break;
                    case "EUR":
                        System.out.println("Converted amount " + amount*0.92);
                        break;
                }
                break;
            case "AZN":
                switch (targetCurrency){
                    case "USD":
                        System.out.println("Converted amount " + amount*0.59);
                    break;
                    case "EUR":
                        System.out.println("Converted amount " + amount*0.54);
                        break;
                }
                break;
            case "EUR":
                switch (targetCurrency){
                    case "USD":
                        System.out.println("Converted amount " + amount*1.08);
                    break;
                    case "AZN":
                        System.out.println("Converted amount" + amount*1.84);
                }
                break;
            default:
                System.out.println("ERROR");
        }


    }
}
