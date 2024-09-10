package ThirdMonth.MainLessons.Lesson18.Task1;

public class OddNumbers extends Thread{

    public  Main test;

    public OddNumbers(Main test){
        this.test=test;
    }
    @Override
    public void run() {
        test.generateOddNumbers();
    }
}
