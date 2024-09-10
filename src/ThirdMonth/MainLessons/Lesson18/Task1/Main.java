package ThirdMonth.MainLessons.Lesson18.Task1;

public class Main {
    public static int n=10000;
    int count=0;

    public synchronized void generateEvenNumbers(){
            while (count<n){
                while (count%2==1){
                    try{
                        wait();
                    }catch (Exception e){
                        e.getMessage();
                    }
                }System.out.println("Even number Thread: "+count);
                count++;
                notify();

            }

    }

    public synchronized void generateOddNumbers(){
            while (count<n){
                while (count%2==0){
                    try {
                        wait();
                    } catch (Exception e){
                        e.getMessage();
                    }
                }System.out.println("Odd number Thread: "+count);
                count++;
                notify();
            }
    }
    public static void main(String[] args) {
        Main object=new Main();
        EvenNumbers t1=new EvenNumbers(object);
        OddNumbers t2=new OddNumbers(object);

        t1.start();
        t2.start();
    }
}
