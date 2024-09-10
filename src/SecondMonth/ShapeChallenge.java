package SecondMonth;

import java.util.Scanner;

public class ShapeChallenge {

    public int findArea(int a, int b){
        return a*b;
    }
    public int findArea(int r){
        return (int)(r*r*Math.PI);
    }
    public double findArea(double side,double height){
        return ((side * height) / 2);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int score=0;
        ShapeChallenge shapeChallenge=new ShapeChallenge();
        for (int i = 0; i <3 ; i++) {
            System.out.println("Choose 1 for finding area of rectangle, 2 for cycle, 3 for triangle");
            int choice=scan.nextInt();
            if(choice==1){
                System.out.println("Enter sides of rectangle: ");
                int a=scan.nextInt();
                int b=scan.nextInt();
                System.out.print("Area: ");
                score=score+5;
                System.out.println(shapeChallenge.findArea(a, b));
            } else if (choice==2) {
                System.out.println("Enter radius of cycle: ");
                int r=scan.nextInt();
                score=score+10;
                System.out.print("Area: ");
                System.out.println(shapeChallenge.findArea(r));
            } else if(choice==3){
                System.out.println("Enter 3 sides of triangle: ");
                double side=scan.nextDouble();
                double height=scan.nextDouble();
                score=score+15;
                System.out.print("Area: ");
                System.out.println(shapeChallenge.findArea(side, height));
            } else {
                System.out.println("Invalid choice.");
            }


        }
        System.out.println("Final score: "+score);


    }
}
