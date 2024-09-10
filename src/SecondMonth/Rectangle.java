package SecondMonth;

import java.util.Scanner;

public class Rectangle extends Shape {
    int firstSide;
    int secondSide;

    public Rectangle(int firstSide, int secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void calculateArea() {
        super.calculateArea();
        System.out.println(firstSide*secondSide);
    }
}
