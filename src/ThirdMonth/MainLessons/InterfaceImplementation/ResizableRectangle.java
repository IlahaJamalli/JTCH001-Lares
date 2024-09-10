package ThirdMonth.MainLessons.InterfaceImplementation;

public class ResizableRectangle implements Resizable{
    int a;
    int b;

    public ResizableRectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void resize() {
        System.out.println(a*b);
    }
}
