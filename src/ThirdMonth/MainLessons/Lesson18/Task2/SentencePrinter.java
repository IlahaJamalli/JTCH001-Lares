package ThirdMonth.MainLessons.Lesson18.Task2;

public class SentencePrinter implements Runnable {
    private Main object;
    private int threadNumber;

    public SentencePrinter(Main main, int threadNumber) {
        this.object = main;
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        object.printWord(threadNumber);
    }
}
