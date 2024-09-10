package ThirdMonth.MainLessons.Additional.Task2;

public class SentencePrinter extends Thread{

    MainClass object;
    int numberCount;

    public SentencePrinter(MainClass object, int numberCount) {
        this.object = object;
        this.numberCount = numberCount;
    }

    @Override
    public void run() {

        object.setWords(numberCount);

    }
}
