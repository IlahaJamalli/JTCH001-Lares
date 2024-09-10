package FirstMonth;

import java.util.Scanner;

public class Main {
    private static String[][] garage = new String[5][3];

    public static void main(String[] args) {
        garage[0] = new String[] {"BMW", "M5", "Black"};
        garage[1] = new String[] {"Opel", "Astra", "Blue"};
        garage[2] = new String[] {"Ford", "Mustang", "Black"};
        garage[3] = new String[] {"Mercedes", "S class", "White"};
        displayGarage();
        addCarToGarage();
    }

    public static void displayGarage() {
        System.out.println("Current state of the car garage:");
        for (int i = 0; i < garage.length; i++) {
            if (garage[i][0] != null) {
                System.out.println("Parking Space " + (i + 1) + ":");
                System.out.println("Name: " + garage[i][0]);
                System.out.println("Model: " + garage[i][1]);
                System.out.println("Color: " + garage[i][2]);
            } else {
                System.out.println("Parking Space " + (i + 1) + ": Empty");
            }
            System.out.println();
        }
    }

    public static void addCarToGarage() {
        Scanner scan = new Scanner(System.in);

        int emptySpace = -1;
        for (int i = 0; i < garage.length; i++) {
            if (garage[i][0] == null) {
                emptySpace = i;
                break;
            }
        }

        if (emptySpace == -1) {
            System.out.println("The garage is full. No parking space available.");
            return;
        }

        System.out.println("Enter details of the new car:");
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Model: ");
        String model = scan.nextLine();
        System.out.print("Color: ");
        String color = scan.nextLine();

        garage[emptySpace] = new String[] {name, model, color};
        System.out.println("Car has been parked in Parking Space " + (emptySpace + 1));
    }
}