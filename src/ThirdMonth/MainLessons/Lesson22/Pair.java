package ThirdMonth.MainLessons.Lesson22;

public class Pair<T, U> {
    T value1;
    U value2;

    public Pair(T value1, U value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public U getValue2() {
        return value2;
    }

    public void swapPair(){

        T temp=value1;
        value1= (T) value2;
        value2=(U) temp;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair =new Pair<>(22, "Hello");
        System.out.println(pair);

        pair.swapPair();
        System.out.println(pair);
    }
}
