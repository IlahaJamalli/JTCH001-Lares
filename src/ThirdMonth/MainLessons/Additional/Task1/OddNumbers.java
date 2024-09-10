package ThirdMonth.MainLessons.Additional.Task1;

public class OddNumbers extends Thread{

    EvenOddNumbers test;

    public OddNumbers(EvenOddNumbers test) {
        this.test = test;
    }

    @Override
    public void run() {
        test.generateOddNumber();
    }
}
