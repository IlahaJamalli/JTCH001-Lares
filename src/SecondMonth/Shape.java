package SecondMonth;

public class Shape {
    public void calculateArea(){

        System.out.print("Area: ");

    }

    public static void main(String[] args) {
        Rectangle r1=new Rectangle(9, 6);
        Cycle c1=new Cycle(4);
        r1.calculateArea();
        c1.calculateArea();
    }
}
