package ThirdMonth.MainLessons.Additional.Task1;

public class EvenNumbers extends Thread{

    EvenOddNumbers test;

    public EvenNumbers(EvenOddNumbers test) {
        this.test = test;
    }

    @Override
    public void run() {
        test.generateEvenNumbers();
    }
}
