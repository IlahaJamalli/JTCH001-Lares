package ThirdMonth.MainLessons.Lesson18.Task1;

public class EvenNumbers extends Thread{

private Main test;

public EvenNumbers(Main test){
    this.test=test;
}
    @Override
    public void run() {
    test.generateEvenNumbers();
     }
}
