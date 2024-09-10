package FirstMonth;

import java.util.Random;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand =new Random();
        int sum=0;
      for (int i = 0; i < array.length; i++) {
           array[i] = rand.nextInt(101);
         sum+=array[i];
      }
      for(int num : array){
          System.out.println(num);
      }
        System.out.println("Ededi orta : "+ sum/ array.length);

    }

    public static class ArrayMinMax {
        public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);
            System.out.println("How many element do you want to add? ");
            int n=scan.nextInt();
            int[] array = new int[n];
            int sum=0;
            int mean=0;

    for(int i=0;i<n; i++){
        System.out.println("Element number " + (i+1));
        array[i]=scan.nextInt();
        sum=sum+array[i];
        mean=sum/n;
    }
            int max=array[0];
            int min=array[0];
            for(int i=0; i<n; i++){
                if(array[i]>max) {
                    max=array[i];
                } else if(array[i]<min) {
                   min=array[i];
                }
            }

            System.out.println("Max number is " + max);
            System.out.println("Min number is " + min);
            System.out.println("Sum of numbers is "+sum);
            System.out.println("Mean of numbers is "+mean);
            System.out.println();

            System.out.println("Enter your target value: ");
            int targetValue=scan.nextInt();
            for (int i = 0; i < n; i++) {
                if(targetValue==array[i]){
                    System.out.println("Target value index: "+ i);
                } else{
                    System.out.println("number is not valid");
                }
            }
        }
    }
}
