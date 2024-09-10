package ThirdMonth.MainLessons.Lesson18.Task2;

public class Main {
    private String[] words1 = {"Getdim", "bir", "2", "kor", "yırtıq", "var"};
    private String[] words2 = {"gördüm", "dərədə", "kar", "kürkü", "kirpi"};
    private int index = 0;

    public synchronized void printWord(int threadNumber) {
            while (index < words1.length+words2.length) {
                if ((threadNumber==1 && index % 2 == 0) || (threadNumber==0 && index % 2 == 1)) {
                    if (threadNumber==1){
                        System.out.println("Thread 1: " + words1[index / 2]);
                    }else{
                        System.out.println("Thread 2: " + words2[index / 2]);
                    }
                    index++;
                    notify();
                } else {
                    try {
                        wait();
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
            }
            notify();

    } public static void main(String[] args) {
        Main main = new Main();
        Thread t1 = new Thread(new SentencePrinter(main, 0));
        Thread t2 = new Thread(new SentencePrinter(main, 1));

        t1.start();
        t2.start();
    }
}
