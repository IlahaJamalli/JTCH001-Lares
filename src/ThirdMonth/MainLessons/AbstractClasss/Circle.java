package ThirdMonth.MainLessons.AbstractClasss;

public class Circle extends Shape {

    int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public int calculateArea() {
        return (int) (r*r*Math.PI);
    }


}
