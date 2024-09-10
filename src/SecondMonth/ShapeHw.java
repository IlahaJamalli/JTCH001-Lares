package SecondMonth;

public class ShapeHw {
    String color;
    double width;
    double length;

    public double calculateArea(){
        return width*length;
    }
    public void printShape(){
        System.out.println("Color: " + color);
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
    }
        public static void main(String[] args) {

            ShapeHw rectangle= new ShapeHw();
            rectangle.color="blue";
            rectangle.width=4;
            rectangle.length=5;
            rectangle.printShape();
            System.out.println("Area: " + rectangle.calculateArea());

            System.out.println();

            ShapeHw square= new ShapeHw();
            square.color="red";
            square.width=4;
            square.length=4;
            square.printShape();
            System.out.println("Area: " + square.calculateArea());


        }

}
