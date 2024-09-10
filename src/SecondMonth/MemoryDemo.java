package SecondMonth;

public class MemoryDemo {
    int a;
    Object object = new Object();

    public MemoryDemo(int a, Object object) {
        this.a = a;
        this.object = object;
    }

    public void stackVsHeap() {
        int b = 3;
        Object object1 = new Object();
        object1 = null;
        System.out.println(b + " is primitive variable in stack ");
        System.out.println();
        System.out.println("Object1 in heap: " + object1);
    }

    public static void main(String[] args) {
        int x = 111;
        Object object2 = new Object();
        MemoryDemo memoryDemo = new MemoryDemo(3, object2);
        System.out.println(x + " is primitive variable in stack ");
        System.out.println();
        System.out.println("Object2 in heap: " + object2);
        System.out.println();
        memoryDemo.stackVsHeap();
    }
}
