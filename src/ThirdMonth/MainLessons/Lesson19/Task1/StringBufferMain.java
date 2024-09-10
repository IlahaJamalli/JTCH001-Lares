package ThirdMonth.MainLessons.Lesson19.Task1;

public class StringBufferMain {

    public static void main(String[] args) {
StringBuffer stringBuffer=new StringBuffer("StringBuffer with any text: ");

Thread thread1=new StringBufferExample(stringBuffer, "test1 ");
Thread thread2=new StringBufferExample(stringBuffer, "text2 ");
Thread thread3=new StringBufferExample(stringBuffer, "text3 ");

thread1.start();
thread2.start();
thread3.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final Modified Content: " + stringBuffer.toString());

    }
}
