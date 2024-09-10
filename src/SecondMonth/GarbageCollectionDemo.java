package SecondMonth;

public class GarbageCollectionDemo {
    public static void runGarbageCollector() {
        System.gc();
    }
    public static void main(String[] args) {
        GarbageCollectionDemo object = new GarbageCollectionDemo();
        object = null;
        runGarbageCollector();
        System.out.println("Garbage collection demo completed.");

    }
}
