package SecondMonth;

public class Cycle extends Shape{
int radius;

    public Cycle(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        super.calculateArea();
        double area=radius*radius*(Math.PI);
        System.out.println(area);
    }
}
