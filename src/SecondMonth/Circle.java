package SecondMonth;

public class Circle {
    //1. Define a Java class "Circle" with an instance variable for the radius.
    // Write a method that calculates and returns the area of the circle.
    // Create a "Circle" object with a radius of 5 units and display its area.
    //2. Explain the difference between a method and a constructor in Java.
    // Provide an example of a method and a constructor in a class and describe their roles.
    int r;

    public Circle(int r) {
        this.r = r;
    }

    public double returnArea(){
        return r*r*Math.PI;
    }

    public static void main(String[] args) {
        Circle circle1=new Circle(5);
        System.out.println(circle1.returnArea());
    }
}
