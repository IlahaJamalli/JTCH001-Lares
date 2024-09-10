package ThirdMonth.MainLessons.Additional.Task2;

public class MainClass {
    private String[] words1 = {"Getdim", "bir", "2", "kor", "yırtıq", "var"};
    private String[] words2 = {"gördüm", "dərədə", "kar", "kürkü", "kirpi"};
    int index=0;

    public synchronized void setWords(int numberCount){
        while (index<words1.length + words2.length){
            if((numberCount==1 && index%2==0) || (numberCount==0 && index%2==1)){
                if(numberCount==1){
                    System.out.print(words1[index/2] + " ");
                } else {
                    System.out.print(words2[index/2] + " ");
                }
index++;
                notify();
            }
            else {
                try {
                    wait();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }

        }
notify();
    }

    public static void main(String[] args) {

        MainClass object=new MainClass();
        Thread t1=new Thread(new SentencePrinter(object, 1));
        Thread t2=new Thread(new SentencePrinter(object, 0));

        t1.start();
        t2.start();

    }



}
