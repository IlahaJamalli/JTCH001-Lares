package ThirdMonth.MainLessons.AbstractClasss;

public class Main {
        public static void main(String[] args) {
            // Create instances of Circle and Square
            Shape circle = new Circle(19);
            Shape square = new Square(3, 4);

            // Calculate and print the areas
            System.out.println("Area of the circle: " + circle.calculateArea());
            System.out.println("Area of the square: " + square.calculateArea());
        }
    }

