package FirstMonth;

import java.util.Random;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter numbers: ");
        int number1=scan.nextInt();
        int number2= scan.nextInt();
        int a=number1+number2;
        int b=number1-number2;
        int c= number1*number2;
        int d=number1/number2;
        System.out.println(a + " " + b + " " + c + " " + d);
    }

    public static class BattleShipGame {
        public static void main(String[] args) {
            char[][] ships = new char[3][4];
            char[][] map = new char[3][4];
            randomShips(ships); //gemileri yerlesdirir
            hitShip(map, ships);
            showRandom(ships); //final positions
        }
        public static void hitShip(char[][] map, char[][] ships) {
            for (int i = 0; i < 3; i++) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Which row do you want to fire? ");
                int row = scanner.nextInt();
                System.out.println("Which column do you want to fire? ");
                int column = scanner.nextInt();


                if (row >= 0 && row < ships.length && column >= 0 && column < ships[row].length) {
                    if (ships[row][column] == 'x') {
                        System.out.println("You hit a ship!");
                        map[row][column] = 'x';
                    } else {
                        System.out.println("Missed.");
                        map[row][column] = '-';
                    }
                } else {
                    System.out.println("Invalid coordinates.");
                } // (given) kordinatin 2d arrayin daxilinde oldgnu yoxlayr


            }
        }

        public static void randomShips(char[][] ships) { //gəmilərin təsadüfi düzülüşü yaradır

            for (int i = 0; i < ships.length; i++) {
                for (int k = 0; k < ships[i].length; k++) {
                    ships[i][k] = new Random().nextBoolean() ? '-' : 'x';
                }
            }
        }

        public static void showRandom(char[][] ships) {
            System.out.println("Ship position: ");
            for (char[] sh : ships) {
                for (char ran : sh) {
                    System.out.print("|");
                    System.out.print(ran);
                    System.out.print("| ");
                }
                System.out.println();
            }

        }
    }
}
