package ThirdMonth.MainLessons.Additional.Task1;

public class EvenOddNumbers {

    int number=10000;
    int count=0;

    public synchronized void generateEvenNumbers(){
        while (count<number){
            while (count%2==1){
                try{
                   wait();
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("Even number: "+ count);
            count++;
            notify();
        }
    }
    public synchronized void generateOddNumber(){
        while(count<number){
            while (count%2==0){
                try {
                    wait();
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("Odd numbers: "+ count);
            count++;
            notify();
        }

    }

    public static void main(String[] args) {

        EvenOddNumbers object=new EvenOddNumbers();
        OddNumbers t1=new OddNumbers(object);
        EvenNumbers t2=new EvenNumbers(object);

        t1.start();
        t2.start();

    }


}
