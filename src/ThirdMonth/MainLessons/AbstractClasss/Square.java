package ThirdMonth.MainLessons.AbstractClasss;

public class Square extends Shape {
    int side1;
    int side2;

    public Square(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public int calculateArea() {
        return side1*side2;
    }
}
