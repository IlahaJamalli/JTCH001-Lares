package FirstMonth;

import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("How many items do you want to add?");
        int number= scan.nextInt();
        String[] groceryList= new String[number];

        for(int i=0; i< number; i++){
            System.out.println("Enter item " + (i+1) + ":" );
            groceryList[i]=scan.next();
        }
        for(int j=0; j< groceryList.length; j++){
            System.out.println("Item " + (j+1) + " is " + groceryList[j]);
        }
    }
}
